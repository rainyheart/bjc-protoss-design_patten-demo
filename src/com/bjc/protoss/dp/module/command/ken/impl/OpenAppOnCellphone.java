package com.bjc.protoss.dp.module.command.ken.impl;

import com.bjc.protoss.dp.module.command.ken.Command;
import com.bjc.protoss.dp.module.command.ken.Target;

public class OpenAppOnCellphone<T extends Target> implements Command<T>
{
	private App app;
	private T target;
	
	@Override
	public void send()
	{
		target.receive(this);
	}
	
	public OpenAppOnCellphone(App app)
	{
		this.app = app;
	}

	@Override
	public void bind(T target)
	{
		this.target = target;
	}

	public App getApp()
	{
		return app;
	}

}
