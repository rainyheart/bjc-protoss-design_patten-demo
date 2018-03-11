package com.bjc.protoss.dp.module.state.ken.impl;

import com.bjc.protoss.dp.module.state.ken.ChangeRequest;
import com.bjc.protoss.dp.module.state.ken.State;

public class Closed extends AbstractState implements State {

	@Override
	public State process(ChangeRequest cr) {
		System.out.println("The change request is closed. It cannot be updated");
				
		return cr.getState();
	}

}
