package com.bjc.protoss.dp.module.strategy.wesley.impl;

import com.bjc.protoss.dp.module.strategy.wesley.DataSource;

public class DataSourceMock implements DataSource {
	String strategy = null;
	DataSource cache = new Redis();
	DataSource db = new MySQL();

	public DataSourceMock(String sourceStrategy){
		this.strategy = sourceStrategy;
	}
	
	@Override
	public String setValue(String key, String value) {
		switch (strategy){
			case "db":
				db.setValue(key, value);
				break;
			case "cache":
				cache.setValue(key, value);
				db.setValue(key, value);
				break;
			default:
				db.setValue(key, value);	
		}

		return value;
	}

	@Override
	public String getValue(String key) {
		String result = null;
		switch (strategy){
		case "db":
			result = db.getValue(key);
			break;
		case "cache":
			result = cache.getValue(key);
			if (result == null) {
				result = db.getValue(key);
			}
			break;
		default:
			result = db.getValue(key);
		}

		return result;
	}

}
