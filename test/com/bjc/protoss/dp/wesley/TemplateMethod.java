package com.bjc.protoss.dp.wesley;

import org.junit.Test;

import com.bjc.protoss.dp.module.template.wesley.impl.DataAccess;
import com.bjc.protoss.dp.module.template.wesley.impl.MySQL;
import com.bjc.protoss.dp.module.template.wesley.impl.Redis;

/**
 * Template Method Pattern defines the skeleton of an algorithm in an operation, deferring some steps to
 * subclasses. Template Method lets subclasses redefine certain steps of an
 * algorithm without changing the algorithm's structure.
 *
 */
public class TemplateMethod {
	
	@Test
	public void accessData() {
		DataAccess access1 = new MySQL();
		access1.writeValue("name1", "Peter");
		access1.readValue("name1");
		
		DataAccess access2 = new Redis();
		access2.writeValue("name2", "Amy");
		access2.readValue("name2");
		
	}

}
