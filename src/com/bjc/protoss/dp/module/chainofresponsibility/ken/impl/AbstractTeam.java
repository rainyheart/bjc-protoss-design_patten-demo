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

import com.bjc.protoss.dp.module.chainofresponsibility.ken.Team;

public abstract class AbstractTeam implements Team {
	protected Team nextTeam;
	protected int teamSize;

	public Team getNextTeam() {
		return nextTeam;
	}

	public void setNextTeam(Team nextTeam) {
		this.nextTeam = nextTeam;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	@Override
	public Team pass() {
		return nextTeam;
	}

}
