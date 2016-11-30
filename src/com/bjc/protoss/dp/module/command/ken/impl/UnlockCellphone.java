package com.bjc.protoss.dp.module.command.ken.impl;

import com.bjc.protoss.dp.module.command.ken.Command;
import com.bjc.protoss.dp.module.command.ken.Target;

public class UnlockCellphone<T extends Target> implements Command<T> {
	private T target;

	@Override
	public void send() {
		target.receive(this);
	}

	@Override
	public void bind(T targetPhone) {
		this.target = targetPhone;
	}

}
