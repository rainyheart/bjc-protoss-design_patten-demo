package com.bjc.protoss.dp.module.visitor.ken.impl;

import com.bjc.protoss.dp.module.visitor.ken.AbstractEmployee;
import com.bjc.protoss.dp.module.visitor.ken.Department;
import com.bjc.protoss.dp.module.visitor.ken.Employee;

public class Worker extends AbstractEmployee implements Employee {

	public Worker(String name, int timesheet, Float salary) {
		super(name, timesheet, salary);
	}

	@Override
	public void accept(Department dept) {
		dept.visit(this);
	}

}
