package com.bjc.protoss.dp.module.state.ken.impl;

import com.bjc.protoss.dp.module.state.ken.State;

public abstract class AbstractState implements State {


	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}

}
