package com.bjc.protoss.dp.module.facade.wesley.impl;

import com.bjc.protoss.dp.module.facade.wesley.DataCache;

public class Redis implements DataCache {
	
	String key = "";
	String value = "";

	@Override
	public String setValue(String key, String value) {
		System.out.println("Redis setValue." + value);
		this.key = key;
		this.value = value;
		return value;
	}

	@Override
	public String getValue(String key) {
		System.out.println("Redis getValue." + key);
		if (this.key.equals(key)) {
			return value;
		} else {
			return null;
		}
	}

}
