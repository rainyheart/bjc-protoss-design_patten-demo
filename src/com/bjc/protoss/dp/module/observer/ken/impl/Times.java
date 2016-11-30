package com.bjc.protoss.dp.module.observer.ken.impl;

import com.bjc.protoss.dp.module.observer.ken.Observer;
import com.bjc.protoss.dp.module.observer.ken.Topic;

public class Times<T> implements Observer<T> {

	@Override
	public void cascade(Topic<T> news) {
		System.out.println("Times publish the message: '" + news.getInformation() + "' to news paper");
	}

}
