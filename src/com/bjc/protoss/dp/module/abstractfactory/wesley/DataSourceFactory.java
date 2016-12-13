package com.bjc.protoss.dp.module.abstractfactory.wesley;

public interface DataSourceFactory {
	
	public DataBase createDataBase();
	
	public DataCache createDataCache();
}
