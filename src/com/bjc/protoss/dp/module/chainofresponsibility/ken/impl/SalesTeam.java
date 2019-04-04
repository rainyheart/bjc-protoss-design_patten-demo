/*------------------------------------------------------------------------------
 * COPYRIGHT Ericsson 2016
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.bjc.protoss.dp.module.chainofresponsibility.ken.impl;

import com.bjc.protoss.dp.module.chainofresponsibility.ken.Project;
import com.bjc.protoss.dp.module.chainofresponsibility.ken.Team;

public class SalesTeam extends AbstractTeam implements Team {

	private Responsibility responsibility = Responsibility.Sales;

	public Responsibility getResponsibility() {
		return responsibility;
	}

	@Override
	public double cost(Project project) {
		if (project.getBudget() > 1000) {
			return 2;
		}
		return 1;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
