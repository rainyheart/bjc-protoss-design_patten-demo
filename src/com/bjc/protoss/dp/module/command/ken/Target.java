package com.bjc.protoss.dp.module.command.ken;

public interface Target {
	public void receive(Command<? extends Target> command);
}
