package com.bjc.protoss.dp.module.adapter.wesley.impl;


import com.bjc.protoss.dp.module.adapter.wesley.DataBase;
import com.bjc.protoss.dp.module.adapter.wesley.DataCache;

public class MySQLObjectAdapter implements DataCache {
	
	DataBase mySQL = null;
	
	public MySQLObjectAdapter(MySQL mySQL) {
		this.mySQL = mySQL;
		System.out.println("Object Adapter to DataCache.");		
	}

	@Override
	public String getCacheName() {
		return mySQL.getDataBaseName();
	}

}
