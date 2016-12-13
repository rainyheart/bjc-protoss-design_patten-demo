package com.bjc.protoss.dp.module.decorator.wesley.impl;

import com.bjc.protoss.dp.module.decorator.wesley.DataCache;

public class Redis implements DataCache {
	
	String key = null;
	String value = null;

	@Override
	public String setValue(String key, String value) {
		System.out.println("Redis setValue.");
		this.key = key;
		this.value = value;
		return value;
	}

	@Override
	public String getValue(String key) {
		System.out.println("Redis getValue.");
		return value;
	}

}
