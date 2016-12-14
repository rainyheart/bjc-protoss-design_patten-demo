package com.bjc.protoss.dp.wesley;

import org.junit.Test;

import com.bjc.protoss.dp.module.facade.wesley.DataSourceFacade;
import com.bjc.protoss.dp.module.facade.wesley.impl.DataSourceMock;

/**
 * 
 * Provide a unified interface to a set of interfaces in a subsystem. Facade
 * defines a higher-level interface that makes the subsystem easier to use.
 * 
 * The pre-condiction is that not changing the existing several intefaces, but build a new one
 * and consolidate/simplify the interface to caller.
 *
 */
public class Facade {
	
	@Test
	public void getSetData () {
		DataSourceFacade dataSource = new DataSourceMock();
		dataSource.setValue("name", "Wesley");
		dataSource.getValue("name");
		
		dataSource.getValue("not exist");
	}

}
