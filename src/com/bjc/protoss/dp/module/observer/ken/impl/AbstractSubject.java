package com.bjc.protoss.dp.module.observer.ken.impl;

import java.util.ArrayList;
import java.util.List;

import com.bjc.protoss.dp.module.observer.ken.Observer;
import com.bjc.protoss.dp.module.observer.ken.Subject;

public abstract class AbstractSubject implements Subject {
	protected List<Observer> observers = new ArrayList<Observer>();

	@Override
	public void register(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void unRegister(Observer observer) {
		this.observers.remove(observer);
	}
}
