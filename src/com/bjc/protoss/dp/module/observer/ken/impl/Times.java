package com.bjc.protoss.dp.module.observer.ken.impl;

import com.bjc.protoss.dp.module.observer.ken.News;
import com.bjc.protoss.dp.module.observer.ken.Observer;

public class Times implements Observer
{

	@Override
	public void cascade(News news)
	{
		System.out.println("Times publish the message: '" + news + "' to news paper");
	}

}
