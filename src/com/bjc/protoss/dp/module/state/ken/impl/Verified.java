package com.bjc.protoss.dp.module.state.ken.impl;

import com.bjc.protoss.dp.module.state.ken.Action;
import com.bjc.protoss.dp.module.state.ken.ChangeRequest;
import com.bjc.protoss.dp.module.state.ken.State;

public class Verified extends AbstractState implements State {

	@Override
	public State process(ChangeRequest cr) {
		if(cr.getBehavior().equals(Action.SUBMIT)) {
			System.out.println("The change request is submitted and updated to Closed state.");
			State nextState = new Closed();		
			cr.setState(nextState);
			return nextState;
		}
		
		return cr.getState();
	}

}
