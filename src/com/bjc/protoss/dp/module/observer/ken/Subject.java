package com.bjc.protoss.dp.module.observer.ken;

public interface Subject<T> {
	public void register(Observer<T> observer);

	public void unRegister(Observer<T> observer);

	public void notifyObservers(Topic<T> message);
}
