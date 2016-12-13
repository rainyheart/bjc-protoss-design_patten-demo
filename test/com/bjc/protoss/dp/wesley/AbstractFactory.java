package com.bjc.protoss.dp.wesley;

import org.junit.Test;

import com.bjc.protoss.dp.module.abstractfactory.wesley.DataSourceFactory;
import com.bjc.protoss.dp.module.abstractfactory.wesley.impl.ClusterDataSourceFactory;
import com.bjc.protoss.dp.module.abstractfactory.wesley.impl.NormalDataSourceFactory;

/**
 * 
 * Abstract Factory pattern provides an interface for creating families of related or dependent objects
 * without specifying their concrete classes.
 *
 */

public class AbstractFactory {
	
	@Test
	public void createNormalDataSource(){
		DataSourceFactory dataSourceFactory = new NormalDataSourceFactory();
		
		System.out.println(dataSourceFactory);
		System.out.println(dataSourceFactory.createDataBase().getName());
		System.out.println(dataSourceFactory.createDataCache().getName());
		
	}

	@Test
	public void createClusterDataSource(){
		DataSourceFactory dataSourceFactory = new ClusterDataSourceFactory();
		
		System.out.println(dataSourceFactory);
		System.out.println(dataSourceFactory.createDataBase().getName());
		System.out.println(dataSourceFactory.createDataCache().getName());
		
	}
}
