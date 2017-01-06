package com.bjc.protoss.dp.module.strategy.wesley.impl;

import com.bjc.protoss.dp.module.strategy.wesley.DataSource;
import com.bjc.protoss.dp.module.strategy.wesley.DataSourceStrategy;

public class DataSourceMock implements DataSource {
	DataSourceStrategy strategy = null;
	DataSource cache = new Redis();
	DataSource db = new MySQL();

	public DataSourceMock(DataSourceStrategy sourceStrategy){
		this.strategy = sourceStrategy;
	}
	
	@Override
	public String setValue(String key, String value) {

		this.strategy.getDataSource().setValue(key, value);
		return value;
	}

	@Override
	public String getValue(String key) {
		String result = this.strategy.getDataSource().getValue(key);

		return result;
	}

}
