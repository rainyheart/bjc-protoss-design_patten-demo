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

public class RequirementTeam extends AbstractTeam implements Team {

	private Responsibility responsibility = Responsibility.Requirement;

	public Responsibility getResponsibility() {
		return responsibility;
	}

	@Override
	public double cost(Project project) {
		if (project.getSize() > this.teamSize) {
			return 100;
		}

		return 100 + ((project.getSize() - this.teamSize) * 2);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}

}
