package com.bjc.protoss.dp.module.observer.ken.impl;

import com.bjc.protoss.dp.module.observer.ken.Observer;
import com.bjc.protoss.dp.module.observer.ken.Topic;

public class Tencent<T> implements Observer<T> {

	@Override
	public void cascade(Topic<T> news) {
		System.out.println("Tencent push the message: '" + news.getInformation() + "' to QQ client");
	}

}
