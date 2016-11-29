package com.bjc.protoss.dp.module.observer.ken.impl;

import com.bjc.protoss.dp.module.observer.ken.Observer;

public class Tencent implements Observer {

	@Override
	public void cascade(News news) {
		System.out.println("Tencent push the message: '" + news + "' to QQ client");
	}

}
