package com.bjc.protoss.dp.module.adapter.wesley.impl;

import com.bjc.protoss.dp.module.adapter.wesley.DataCache;

/**
 * 
 * Class Adapter: A new class to extend the existing one and implement the new interface.
 *
 */
public class MySQLClassAdapter extends MySQL implements DataCache {
	
	public MySQLClassAdapter() {
		System.out.println("Class Adapter to DataCache.");
	}

	@Override
	public String getCacheName() {
		return getDataBaseName();
	}

}
