package com.bjc.protoss.dp.module.observer.ken;

public interface Subject
{
	public void register(Observer observer);
	public void unRegister(Observer observer);
	public void notifyObservers(News message);
}
