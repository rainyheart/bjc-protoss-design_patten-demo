package com.bjc.protoss.dp.module.command.ken;

public interface Command<T extends Target> {
	public void send();

	public void bind(T target);
}
