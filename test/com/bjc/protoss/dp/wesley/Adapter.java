package com.bjc.protoss.dp.wesley;

import org.junit.Test;

import com.bjc.protoss.dp.module.adapter.wesley.DataCache;
import com.bjc.protoss.dp.module.adapter.wesley.impl.MySQL;
import com.bjc.protoss.dp.module.adapter.wesley.impl.MySQLClassAdapter;
import com.bjc.protoss.dp.module.adapter.wesley.impl.MySQLObjectAdapter;

/**
 * 
 * Adapter pattern converts the interface of a class into another interface clients expect.
 * Adapter lets classes work together that couldn't otherwise because of
 * incompatible interfaces.
 * 
 * The pre-condiction is that do not change the existing interface/class, but leverage
 * (inherit/composite) an existing object to implement a new interface. 
 * 
 * The pre-condiction is different to bridge.
 *
 */
public class Adapter {
	
	@Test
	public void adaptClass(){
		DataCache cache = new MySQLClassAdapter();
		System.out.println(cache.getCacheName());
	}
	
	
	@Test
	public void adaptObject(){
		DataCache cache = new MySQLObjectAdapter(new MySQL());
		System.out.println(cache.getCacheName());
	}
	

}
