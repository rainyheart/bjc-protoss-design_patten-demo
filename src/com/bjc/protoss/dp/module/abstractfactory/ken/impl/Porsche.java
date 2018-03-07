package com.bjc.protoss.dp.module.abstractfactory.ken.impl;

import com.bjc.protoss.dp.module.abstractfactory.ken.Car;

public class Porsche implements Car {
	public Porsche() {
		System.out.println("Porsche is produced");
	}

	@Override
	public void run(boolean forwardOrbackward) {
		System.out.println("Porsche is running " + (forwardOrbackward ? "forward" : "backward"));
	}

	@Override
	public void stop() {
		System.out.println("Porsche is stopped");
	}

}
