package com.bjc.protoss.dp.module.visitor.ken;

public abstract class AbstractEmployee implements Employee {

	protected String name;
	protected int timesheet;
	protected Float salary;
	
	public AbstractEmployee(String name, int timesheet, Float salary) {
		super();
		this.name = name;
		this.timesheet = timesheet;
		this.salary = salary;
	}

	@Override
	public Float salary() {
		return this.salary;
	}

	@Override
	public String name() {
		return this.name;
	}

	@Override
	public int timesheet() {
		return this.timesheet;
	}

	public void setTimesheet(int timesheet) {
		this.timesheet = timesheet;
	}

}
