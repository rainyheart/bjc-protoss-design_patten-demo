package com.bjc.protoss.dp.module.observer.ken.impl;

import com.bjc.protoss.dp.module.observer.ken.Observer;
import com.bjc.protoss.dp.module.observer.ken.Subject;

public class WhiteHouse extends AbstractSubject implements Subject {

	@Override
	public void notifyObservers(News message) {
		for (Observer observer : super.observers) {
			observer.cascade(message);
		}

	}

}
