package com.bjc.protoss.dp.module.abstractfactory.wesley.impl;

import com.bjc.protoss.dp.module.abstractfactory.wesley.DataCache;

public class Redis implements DataCache {

	@Override
	public String getName() {
		
		return "Redis";
	}

}
