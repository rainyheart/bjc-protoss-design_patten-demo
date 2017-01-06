package com.bjc.protoss.dp.wesley;

import org.junit.Test;

import com.bjc.protoss.dp.module.strategy.wesley.DataSource;
import com.bjc.protoss.dp.module.strategy.wesley.DataSourceStrategy;
import com.bjc.protoss.dp.module.strategy.wesley.impl.DataSourceMock;
import com.bjc.protoss.dp.module.strategy.wesley.impl.MySQL;
import com.bjc.protoss.dp.module.strategy.wesley.impl.Redis;

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
		DataSourceStrategy strategy_db = new MySQL();
		DataSourceStrategy strategy_db_with_cache = new Redis();
		DataSource source1 = new DataSourceMock(strategy_db);
		source1.setValue("name1", "Peter");
		source1.getValue("name1");
		
		DataSource source2 = new DataSourceMock(strategy_db_with_cache);
		source2.setValue("name2", "Amy");
		source2.getValue("name2");
	}

}
