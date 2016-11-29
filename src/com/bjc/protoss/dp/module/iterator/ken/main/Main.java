/*------------------------------------------------------------------------------
 * COPYRIGHT Ericsson 2016
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.bjc.protoss.dp.module.iterator.ken.main;

import com.bjc.protoss.dp.module.iterator.ken.Collection;
import com.bjc.protoss.dp.module.iterator.ken.Iterator;
import com.bjc.protoss.dp.module.iterator.ken.impl.CollectionImpl;

public class Main {

	public static void main(String[] args) {
		Collection<String> myCollection = new CollectionImpl<String>();
		myCollection.add("Hello");
		myCollection.add("World");
		myCollection.add("Protoss");
		myCollection.add("Team");
		Iterator<String> it = myCollection.iterator();

		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println("\r\n--------------------");
		while (it.hasPrevious()) {
			System.out.print(it.previous() + " ");
		}
		System.out.println("\r\n--------------------");
		System.out.println(myCollection);

	}

}
