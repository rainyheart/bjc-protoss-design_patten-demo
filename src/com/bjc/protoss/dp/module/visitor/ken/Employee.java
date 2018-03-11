package com.bjc.protoss.dp.module.visitor.ken;

public interface Employee {
	public void accept(Department dept);

	public Float salary();

	public String name();

	public int timesheet();
}
