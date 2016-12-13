package com.bjc.protoss.dp.module.facade.wesley.impl;

import com.bjc.protoss.dp.module.facade.wesley.DataBase;

public class MySQL implements DataBase {
	
	String key = "";
	String value = "";

	@Override
	public String setValue(String key, String value) {
		System.out.println("MySQL setValue." + value);
		this.key = key;
		this.value = value;
		return value;
	}

	@Override
	public String getValue(String key) {
		System.out.println("MySQL getValue." + key);
		if (this.key.equals(key)) {
			return value;
		} else {
			return null;
		}
	}

}
