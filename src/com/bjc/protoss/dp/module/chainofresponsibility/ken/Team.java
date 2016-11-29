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

public interface Team {
	public enum Responsibility {
		Salse(0), Requirement(1), Design(2), Development(3), Testing(4), Integration(5), Deployment(6), Support(7);

		private int level;

		private Responsibility(int level) {
			this.level = level;
		}

		public int getLevel() {
			return level;
		}
	}

	public double cost(Project project);

	public Team pass();

	public void setNextTeam(Team nextTeam);
}
