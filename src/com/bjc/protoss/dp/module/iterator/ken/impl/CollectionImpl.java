/*------------------------------------------------------------------------------
 * COPYRIGHT Ericsson 2016
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.bjc.protoss.dp.module.iterator.ken.impl;

import java.util.Arrays;

import com.bjc.protoss.dp.module.iterator.ken.Collection;
import com.bjc.protoss.dp.module.iterator.ken.Iterator;

public class CollectionImpl<E> implements Collection<E> {

	private int defaultSize = 10;
	private int remain = defaultSize;
	private Iterator<E> iterator = new IteratorImpl();
	private Object[] array = new Object[defaultSize];

	@Override
	public Iterator<E> iterator() {
		return iterator;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E get(int index) {
		return (E) array[index];
	}

	@SuppressWarnings("unchecked")
	@Override
	public E remove(int index) {
		E removedE = (E) array[index];
		int numMoved = array.length - index - 1;
		if (numMoved > 0) {
			System.arraycopy(array, index + 1, array, index, numMoved);
		}
		remain++;
		return removedE;
	}

	@Override
	public void add(int index, E e) {
		if (remain <= 0) {
			Arrays.copyOf(array, array.length * 2);
			System.arraycopy(array, index, array, index + 1, array.length - index);
		}
		array[index] = e;
		remain--;
	}

	@Override
	public void add(E e) {
		if (remain <= 0) {
			Arrays.copyOf(array, array.length * 2);
			System.arraycopy(array, 0, array, 0, array.length + 1);
		}
		array[array.length - remain] = e;
		remain--;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (Object s : array) {
			sb.append(String.valueOf(s)).append(",");
		}
		if (sb.length() > 1) {
			sb.deleteCharAt(sb.length() - 1);
		}
		sb.append("]");
		return sb.toString();
	}

	private class IteratorImpl implements Iterator<E> {

		private int current = 0;

		@SuppressWarnings("unchecked")
		@Override
		public E next() {
			E e = (E) array[current];
			current++;
			return e;
		}

		@SuppressWarnings("unchecked")
		@Override
		public E previous() {
			current--;
			E e = (E) array[current];
			return e;
		}

		@Override
		public boolean hasNext() {
			return (current + 1) <= (array.length - remain);
		}

		@Override
		public boolean hasPrevious() {
			return (current - 1) >= 0;
		}

	}
}
