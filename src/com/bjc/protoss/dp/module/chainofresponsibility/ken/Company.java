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

import com.bjc.protoss.dp.module.chainofresponsibility.ken.impl.DesignTeam;
import com.bjc.protoss.dp.module.chainofresponsibility.ken.impl.DevelopmentTeam;
import com.bjc.protoss.dp.module.chainofresponsibility.ken.impl.RequirementTeam;
import com.bjc.protoss.dp.module.chainofresponsibility.ken.impl.SalseTeam;
import com.bjc.protoss.dp.module.chainofresponsibility.ken.impl.SupportTeam;
import com.bjc.protoss.dp.module.chainofresponsibility.ken.impl.TestTeam;

public class Company {

	private String companyName;
	private Team firstTeam;

	public Company(String companyName) {
		Team salse = new SalseTeam();
		Team requiement = new RequirementTeam();
		Team design = new DesignTeam();
		Team development = new DevelopmentTeam();
		Team testing = new TestTeam();
		Team support = new SupportTeam();

		salse.setNextTeam(requiement);
		requiement.setNextTeam(design);
		design.setNextTeam(development);
		development.setNextTeam(testing);
		testing.setNextTeam(support);

		this.companyName = companyName;
		this.firstTeam = salse;

	}

	private double calculateCost(Project project) {
		double totalCost = 0;
		Team nextTeam = firstTeam;
		do {
			double cost = nextTeam.cost(project);
			System.out.println(nextTeam + "'s cost is " + cost);
			totalCost += cost;
			nextTeam = nextTeam.pass();
		} while (nextTeam != null);

		return totalCost;
	}

	public double doProject(Project project) {
		double budget = project.getBudget();
		double cost = this.calculateCost(project);
		System.out.println("=====> Total cost of " + project + " is " + cost + ", budget is " + budget);
		double revenue = budget - cost;
		if (revenue > 0) {
			return revenue;
		}

		throw new UnsupportedOperationException(
				"Sorry, we cannot do this project because we will lost " + Math.abs(revenue) + "$");
	}

	@Override
	public String toString() {
		return companyName;
	}
}
