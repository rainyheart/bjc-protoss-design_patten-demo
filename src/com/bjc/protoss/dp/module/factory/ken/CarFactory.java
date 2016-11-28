package com.bjc.protoss.dp.module.factory.ken;

public class CarFactory
{
	public Car produce(Class<? extends Car> carClazz){
		Car car = null;
		try
		{
			car = carClazz.newInstance();
		}
		catch (InstantiationException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IllegalAccessException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return car;
	}
}
