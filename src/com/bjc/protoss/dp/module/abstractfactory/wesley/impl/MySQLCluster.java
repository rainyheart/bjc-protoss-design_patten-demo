package com.bjc.protoss.dp.module.abstractfactory.wesley.impl;

import com.bjc.protoss.dp.module.abstractfactory.wesley.DataBase;

public class MySQLCluster implements DataBase {

	@Override
	public String getName() {

		return "MySQL Cluster";
	}

}
