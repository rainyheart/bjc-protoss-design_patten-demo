package com.bjc.protoss.dp.module.factory.ken.main;

import com.bjc.protoss.dp.module.factory.ken.Car;
import com.bjc.protoss.dp.module.factory.ken.CarFactory;
import com.bjc.protoss.dp.module.factory.ken.impl.BMW;
import com.bjc.protoss.dp.module.factory.ken.impl.Porsche;

public class Main
{

	public static void main(String[] args)
	{
		CarFactory carFactory = new CarFactory();
		
		Car bmw = carFactory.produce(BMW.class);
		
		bmw.run(true);

		Car porsche = carFactory.produce(Porsche.class);
		
		porsche.run(true);
		
		bmw.stop();
		porsche.stop();
	}

}
