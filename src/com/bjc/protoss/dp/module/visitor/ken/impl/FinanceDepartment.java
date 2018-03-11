package com.bjc.protoss.dp.module.visitor.ken.impl;

import com.bjc.protoss.dp.module.visitor.ken.Department;

public class FinanceDepartment implements Department {

	@Override
	public void visit(Manager manager) {
		System.out.println("The salary of manager " + manager.name() + " is " + manager.salary());
	}

	@Override
	public void visit(Worker worker) {
		System.out.println("The salary of worker " + worker.name() + " is " + worker.salary());
	}

	@Override
	public void visit(Tester tester) {
		System.out.println("The salary of tester " + tester.name() + " is " + tester.salary());
	}

}
