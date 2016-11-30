package com.bjc.protoss.dp.module.observer.ken.impl;

import java.util.ArrayList;
import java.util.List;

import com.bjc.protoss.dp.module.observer.ken.Observer;
import com.bjc.protoss.dp.module.observer.ken.Subject;

public abstract class AbstractSubject<T> implements Subject<T> {
	protected List<Observer<T>> observers = new ArrayList<Observer<T>>();

	@Override
	public void register(Observer<T> observer) {
		this.observers.add(observer);
	}

	@Override
	public void unRegister(Observer<T> observer) {
		this.observers.remove(observer);
	}
}
