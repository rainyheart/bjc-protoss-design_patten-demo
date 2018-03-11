package com.bjc.protoss.dp.module.visitor.ken.impl;

import com.bjc.protoss.dp.module.visitor.ken.Department;

public class HRDepartment implements Department {

	@Override
	public void visit(Manager manager) {
		System.out.println("Timesheet of manager " + manager.name() + " is " + manager.timesheet());
	}

	@Override
	public void visit(Worker worker) {
		System.out.println("Timesheet of worker " + worker.name() + " is " + worker.timesheet());
	}

	@Override
	public void visit(Tester tester) {
		System.out.println("Timesheet of tester " + tester.name() + " is " + tester.timesheet());
	}

}
