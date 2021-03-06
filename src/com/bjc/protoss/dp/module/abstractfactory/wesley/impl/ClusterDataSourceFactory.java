package com.bjc.protoss.dp.module.abstractfactory.wesley.impl;

import com.bjc.protoss.dp.module.abstractfactory.wesley.DataBase;
import com.bjc.protoss.dp.module.abstractfactory.wesley.DataCache;
import com.bjc.protoss.dp.module.abstractfactory.wesley.DataSourceFactory;

public class ClusterDataSourceFactory implements DataSourceFactory {

	@Override
	public DataBase createDataBase() {
		return new MySQLCluster();
	}

	@Override
	public DataCache createDataCache() {
		return new RedisCluster();
	}

}
