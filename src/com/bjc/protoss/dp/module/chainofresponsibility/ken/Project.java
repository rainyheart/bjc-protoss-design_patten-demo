/*------------------------------------------------------------------------------
 * COPYRIGHT Ericsson 2016
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.bjc.protoss.dp.module.chainofresponsibility.ken;

public class Project {

	private String name;
	private double budget;
	private int size;

	public Project(String name, double budget, int size) {
		this.name = name;
		this.budget = budget;
		this.size = size;
	}

	public double getBudget() {
		return this.budget;
	}

	public int getSize() {
		return size;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
