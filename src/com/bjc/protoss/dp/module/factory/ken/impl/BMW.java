package com.bjc.protoss.dp.module.factory.ken.impl;

import com.bjc.protoss.dp.module.factory.ken.Car;

public class BMW implements Car {
	public BMW() {
		System.out.println("BMW is produced");
	}

	@Override
	public void run(boolean forwardOrbackward) {
		System.out.println("BMW is running " + (forwardOrbackward ? "forward" : "backward"));
	}

	@Override
	public void stop() {
		System.out.println("BMW is stopped");
	}

}
