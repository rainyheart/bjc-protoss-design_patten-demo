package com.bjc.protoss.dp.module.observer.ken.impl;

import com.bjc.protoss.dp.module.observer.ken.News;
import com.bjc.protoss.dp.module.observer.ken.Observer;

public class Sina implements Observer
{

	@Override
	public void cascade(News news)
	{
		System.out.println("Sina publish the message: '" + news + "' to www.sina.com");
	}

}
