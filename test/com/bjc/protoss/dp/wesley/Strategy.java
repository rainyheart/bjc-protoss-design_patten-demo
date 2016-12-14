package com.bjc.protoss.dp.wesley;

import org.junit.Test;

import com.bjc.protoss.dp.module.strategy.wesley.DataSource;
import com.bjc.protoss.dp.module.strategy.wesley.impl.DataSourceMock;

/**
 * 
 * Strategy define a family of algorithms, encapsulate each one, and make them
 * interchangeable. Strategy lets the algorithm vary independently from clients
 * that use it.
 *
 */
public class Strategy {
	
	@Test
	public void getSetdataSource(){
		DataSource source1 = new DataSourceMock("db");
		source1.setValue("name1", "Peter");
		source1.getValue("name1");
		
		DataSource source2 = new DataSourceMock("cache");
		source2.setValue("name2", "Amy");
		source2.getValue("name2");
	}

}
