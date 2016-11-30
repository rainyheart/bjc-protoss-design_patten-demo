package com.bjc.protoss.dp.module.observer.ken;

public interface Observer<T> {
	public void cascade(Topic<T> news);
}
