package com.bjc.protoss.dp.module.facade.wesley.impl;

import com.bjc.protoss.dp.module.facade.wesley.Authorization;
import com.bjc.protoss.dp.module.facade.wesley.DataBase;
import com.bjc.protoss.dp.module.facade.wesley.DataCache;
import com.bjc.protoss.dp.module.facade.wesley.DataSourceFacade;

public class DataSourceMock implements DataSourceFacade {

	Authorization authorization = new OAuth();
	DataCache cache = new Redis();
	DataBase db = new MySQL();
	
	@Override
	public String setValue(String key, String value) {
		boolean authorized = authorization.authorize("");
		if (authorized) {
			cache.setValue(key, value);
			db.setValue(key, value);
		}
		return value;
	}

	@Override
	public String getValue(String key) {
		String result = null;
		boolean authorized = authorization.authorize("");
		if (authorized) {
			result = cache.getValue(key);
			if (result == null) {
				result = db.getValue(key);
			}
		}
		return result;
	}

}
