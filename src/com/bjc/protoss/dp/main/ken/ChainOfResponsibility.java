/*------------------------------------------------------------------------------
 * COPYRIGHT Ericsson 2016
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.bjc.protoss.dp.main.ken;

import com.bjc.protoss.dp.module.chainofresponsibility.ken.Client;
import com.bjc.protoss.dp.module.chainofresponsibility.ken.Company;
import com.bjc.protoss.dp.module.chainofresponsibility.ken.Project;

public class ChainOfResponsibility {

	public static void main(String[] args) {
		Company bjc = new Company("bjc");

		Project taobao = new Project("Taobao", 1000, 50);
		Client alibaba = new Client(taobao);

		double revenueTaobao = bjc.doProject(alibaba.getProject());

		System.out.println("The revenue of " + taobao + " is " + revenueTaobao);

		System.out.println("----------------------------");

		Project qq = new Project("QQ", 1000, 100);
		Client tencent = new Client(qq);

		double revenueQQ = bjc.doProject(tencent.getProject());

		System.out.println("The revenue of " + qq + " is " + revenueQQ);
	}

}
