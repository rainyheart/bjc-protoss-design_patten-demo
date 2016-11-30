package com.bjc.protoss.dp.module.observer.ken.impl;

import com.bjc.protoss.dp.module.observer.ken.Observer;
import com.bjc.protoss.dp.module.observer.ken.Subject;
import com.bjc.protoss.dp.module.observer.ken.Topic;

public class WhiteHouse<T> extends AbstractSubject<T> implements Subject<T> {

	@Override
	public void notifyObservers(Topic<T> topic) {
		for (Observer<T> observer : super.observers) {
			observer.cascade(topic);
		}
	}

}
