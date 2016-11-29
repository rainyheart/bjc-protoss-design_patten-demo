/*------------------------------------------------------------------------------
 * COPYRIGHT Ericsson 2016
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.bjc.protoss.dp.module.interpreter.ken.main;

import com.bjc.protoss.dp.module.interpreter.ken.Expression;
import com.bjc.protoss.dp.module.interpreter.ken.LocationInterpreter;
import com.bjc.protoss.dp.module.interpreter.ken.Position;
import com.bjc.protoss.dp.module.interpreter.ken.impl.From;
import com.bjc.protoss.dp.module.interpreter.ken.impl.Goto;

public class Main {
	public static void main(String[] args) {
		String message = "I will goto school from home now!";

		LocationInterpreter from = new From();
		LocationInterpreter go = new Goto();

		Expression exp = new Expression(message);
		Position fromPos = from.interpret(exp);
		Position toPos = go.interpret(exp);

		System.out.println("Start position + " + fromPos + ", end position " + toPos);
	}
}
