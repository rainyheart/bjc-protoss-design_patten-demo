package com.bjc.protoss.dp.module.proxy.wesley.impl;

import java.util.ArrayList;
import java.util.List;


import com.bjc.protoss.dp.module.proxy.wesley.DataCache;

public class RedisShardProxy implements DataCache {

	private static int index = 0; 
	private List<DataCache> concreteCacheList = null;


	public RedisShardProxy(){
		concreteCacheList = new ArrayList<DataCache>();
		concreteCacheList.add(new Redis(0));
		concreteCacheList.add(new Redis(1));
		concreteCacheList.add(new Redis(2));
	}
	
	@Override
	public String getName() {
		System.out.println("Reids Shard Proxy authorize the caller.");
		return concreteCacheList.get(index++%3).getName();
	}

}
