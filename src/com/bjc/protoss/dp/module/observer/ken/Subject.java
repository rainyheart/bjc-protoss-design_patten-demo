package com.bjc.protoss.dp.module.observer.ken;

import com.bjc.protoss.dp.module.observer.ken.impl.News;

public interface Subject {
	public void register(Observer observer);

	public void unRegister(Observer observer);

	public void notifyObservers(News message);
}
