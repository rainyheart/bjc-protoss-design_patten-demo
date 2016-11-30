package com.bjc.protoss.dp.ken;

import org.junit.Test;

import com.bjc.protoss.dp.module.factory.ken.Car;
import com.bjc.protoss.dp.module.factory.ken.CarFactory;
import com.bjc.protoss.dp.module.factory.ken.impl.BMW;
import com.bjc.protoss.dp.module.factory.ken.impl.Porsche;

/**
 *
 * Definition:<br/>
 * Factory pattern is one of most used design patterns in Java. This type of
 * design pattern comes under creational pattern as this pattern provides one of
 * the best ways to create an object. In Factory pattern, we create objects
 * without exposing the creation logic to the client and refer to newly created
 * object using a common interface.
 *
 */
public class Factory {

	@Test
	public void execute() {
		CarFactory carFactory = new CarFactory();

		Car bmw = carFactory.produce(BMW.class);

		bmw.run(true);

		Car porsche = carFactory.produce(Porsche.class);

		porsche.run(true);

		bmw.stop();
		porsche.stop();
	}

}
