package com.bjc.protoss.dp.module.template.wesley.impl;

import com.bjc.protoss.dp.module.template.wesley.Authorization;
import com.bjc.protoss.dp.module.template.wesley.DataSource;

public abstract class DataAccess {
	private Authorization authorization = new OAuth();
	
	public abstract DataSource getDataSource();

	public String writeValue(String key, String value) {

		boolean authorized = authorization.authorize("");

		if (authorized) {
			getDataSource().setValue(key, value);
		}
		
		return value;
	}

	public String readValue(String key) {
		String result = null;
		
		boolean authorized = authorization.authorize("");

		if (authorized) {
			result = getDataSource().getValue(key);
		}
		
		return result;
	}

}
