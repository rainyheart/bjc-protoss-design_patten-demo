/*------------------------------------------------------------------------------
 * COPYRIGHT Ericsson 2016
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.bjc.protoss.dp.ken;

import org.junit.Test;

import com.bjc.protoss.dp.module.chainofresponsibility.ken.Client;
import com.bjc.protoss.dp.module.chainofresponsibility.ken.Company;
import com.bjc.protoss.dp.module.chainofresponsibility.ken.Project;

/**
 *
 * Definition:<br/>
 * Chain-of-responsibility pattern is a design pattern consisting of a
 * source of command objects and a series of processing objects.
 * Each processing object contains logic that defines the types of
 * command objects that it can handle; the rest are passed to the next
 * processing object in the chain.
 *
 * 
 */
public class ChainOfResponsibility {

    @Test
    public void execute() {
        Company bjc = new Company("bjc");

        Project taobao = new Project("Taobao", 1000, 50);
        Client alibaba = new Client(taobao);

        double revenueTaobao = bjc.doProject(alibaba.getProject());

        System.out.println("The revenue of " + taobao + " is " + revenueTaobao);

        System.out.println("----------------------------");

        Project qq = new Project("QQ", 1000, 100);
        Client tencent = new Client(qq);

        try {
            double revenueQQ = bjc.doProject(tencent.getProject());

            System.out.println("The revenue of " + qq + " is " + revenueQQ);
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }

}
