package com.bjc.protoss.dp.module.abstractfactory.wesley.impl;

import com.bjc.protoss.dp.module.abstractfactory.wesley.DataBase;

public class MySQL implements DataBase {

	@Override
	public String getName() {
		
		return "MySQL";
	}

}
