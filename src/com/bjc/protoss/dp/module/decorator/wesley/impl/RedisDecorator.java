package com.bjc.protoss.dp.module.decorator.wesley.impl;

import com.bjc.protoss.dp.module.decorator.wesley.DataCache;

public class RedisDecorator implements DataCache {
	
	private DataCache cache = null;
	private static int setOperation  = 0;
	private static int getOperation  = 0;
	
	public RedisDecorator(DataCache cache) {
		this.cache = cache;
	}

	@Override
	public String setValue(String key, String value) {
		System.out.println("RedisDecorator set opertion:" + setOperation++);
		return cache.setValue(key, value);
	}

	@Override
	public String getValue(String key) {
		System.out.println("RedisDecorator get opertion:" + getOperation++);
		return cache.getValue(key);
	}

}
