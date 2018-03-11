package com.bjc.protoss.dp.module.state.ken;

import com.bjc.protoss.dp.module.state.ken.impl.Draft;

public class ChangeRequest {

	private State state;
	private Action behavior;

	public ChangeRequest() {
		super();
		System.out.println("A change request is created.");
		this.state = new Draft();
		System.out.println("The change request is now under " + state + " state");
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public State process(Action behavior) {
		this.behavior = behavior;
		System.out.println(behavior + " the change request now.");
		State currentState = this.state.process(this);
		System.out.println("The change request is now under " + currentState + " state");
		
		return currentState;
	}

	public Action getBehavior() {
		return behavior;
	}

	public void setBehavior(Action behavior) {
		this.behavior = behavior;
	}
}
