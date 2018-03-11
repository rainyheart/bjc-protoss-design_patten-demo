package com.bjc.protoss.dp.module.visitor.ken;

import com.bjc.protoss.dp.module.visitor.ken.impl.Manager;
import com.bjc.protoss.dp.module.visitor.ken.impl.Tester;
import com.bjc.protoss.dp.module.visitor.ken.impl.Worker;

public interface Department {

	public void visit(Manager manager);
	public void visit(Worker worker);
	public void visit(Tester tester);
}
