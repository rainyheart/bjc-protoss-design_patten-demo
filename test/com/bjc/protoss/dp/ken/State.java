/*------------------------------------------------------------------------------
 * COPYRIGHT BJC 2018
 *
 * The copyright to the computer program(s) herein is the property of
 * BJC Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.bjc.protoss.dp.ken;

import org.junit.Test;

import com.bjc.protoss.dp.module.state.ken.Action;
import com.bjc.protoss.dp.module.state.ken.ChangeRequest;

/**
 * The state pattern is a behavioral software design pattern that implements a
 * state machine in an object-oriented way. With the state pattern, a state
 * machine is implemented by implementing each individual state as a derived
 * class of the state pattern interface, and implementing state transitions by
 * invoking methods defined by the pattern's superclass.
 * 
 */
public class State {

	@Test
	public void changeOrder() {
		System.out.println("============ create change request 1 ===============");
		ChangeRequest cr = new ChangeRequest();

		System.out.println("============ action 1 ===============");
		cr.process(Action.UPDATE);
		System.out.println("============ action 2 ===============");
		cr.process(Action.SUBMIT);
		System.out.println("============ action 3 ===============");
		cr.process(Action.UPDATE);
		System.out.println("============ action 4 ===============");
		cr.process(Action.SUBMIT);
		System.out.println("============ action 5 ===============");
		cr.process(Action.SUBMIT);
		System.out.println("============ action 6 ===============");
		cr.process(Action.SUBMIT);
		System.out.println("============ action 7 ===============");
		cr.process(Action.SUBMIT);
		System.out.println("============ action 8 ===============");
		cr.process(Action.SUBMIT);
	}
}
