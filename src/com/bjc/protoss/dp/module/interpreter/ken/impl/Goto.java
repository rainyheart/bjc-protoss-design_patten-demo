/*------------------------------------------------------------------------------
 * COPYRIGHT Ericsson 2016
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.bjc.protoss.dp.module.interpreter.ken.impl;

import java.util.LinkedList;

import com.bjc.protoss.dp.module.interpreter.ken.Expression;
import com.bjc.protoss.dp.module.interpreter.ken.LocationInterpreter;
import com.bjc.protoss.dp.module.interpreter.ken.Place;
import com.bjc.protoss.dp.module.interpreter.ken.Position;
import com.bjc.protoss.dp.module.interpreter.ken.place.Home;
import com.bjc.protoss.dp.module.interpreter.ken.place.Mars;
import com.bjc.protoss.dp.module.interpreter.ken.place.School;

public class Goto implements LocationInterpreter {

	@Override
	public Position interpret(Expression expression) {

		Place place = new Mars();
		LinkedList<Expression> words = (LinkedList<Expression>) expression.getSplitedWords();

		for (Expression word : words) {
			if (word.getWord().equalsIgnoreCase("goto")) {
				Expression target = word.getNext();

				if (target.getWord().equalsIgnoreCase("school")) {
					place = new School();
					break;
				} else if (target.getWord().equalsIgnoreCase("home")) {
					place = new Home();
					break;
				} else {
					place = new Mars();
					break;
				}
			}
		}

		return place.getPosition();
	}

}
