package com.bjc.protoss.dp.module.proxy.wesley.impl;

import com.bjc.protoss.dp.module.proxy.wesley.DataCache;

public class Redis implements DataCache {
	private int index = -1;
	
	public Redis(int index) {
		this.index = index;
	}

	@Override
	public String getName() {
		
		return "Redis"+index;
	}

}
