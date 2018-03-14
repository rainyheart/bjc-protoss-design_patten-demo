/*------------------------------------------------------------------------------
 * COPYRIGHT BJC 2018
 *
 * The copyright to the computer program(s) herein is the property of
 * BJC Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.bjc.protoss.dp.ken;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.bjc.protoss.dp.module.visitor.ken.Department;
import com.bjc.protoss.dp.module.visitor.ken.Employee;
import com.bjc.protoss.dp.module.visitor.ken.impl.FinanceDepartment;
import com.bjc.protoss.dp.module.visitor.ken.impl.HRDepartment;
import com.bjc.protoss.dp.module.visitor.ken.impl.Manager;
import com.bjc.protoss.dp.module.visitor.ken.impl.Tester;
import com.bjc.protoss.dp.module.visitor.ken.impl.Worker;

/**
 * Definition:<br/>
 * Visitor design pattern is a way of separating an algorithm from an
 * object
 * structure on which it operates. A practical result of this
 * separation is the
 * ability to add new operations to existent object structures without
 * modifying
 * the structures. It is one way to follow the open/closed principle.
 *
 */
public class Visitor {

    private List<Employee> team = new ArrayList<>();

    @Before
    public void buildUpATeam() {
        Employee tim = new Manager("Tim", 8 * 22, 10000.00f);
        Employee kate = new Worker("Kate", 7 * 22, 8000.00f);
        Employee ray = new Worker("Ray", 7 * 22, 8000.00f);
        Employee jim = new Worker("Jim", 7 * 22, 8000.00f);
        Employee tester = new Tester("Jim", 9 * 22, 9000.00f);

        team.add(tim);
        team.add(kate);
        team.add(ray);
        team.add(jim);
        team.add(tester);
    }

    @Test
    public void hrVisitor() {
        Department hr = new HRDepartment();

        for (Employee employee : team) {
            employee.accept(hr);
        }
    }

    @Test
    public void financeVisitor() {
        Department hr = new FinanceDepartment();

        for (Employee employee : team) {
            employee.accept(hr);
        }
    }
}
