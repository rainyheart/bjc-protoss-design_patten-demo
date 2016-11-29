package com.bjc.protoss.dp.module.strategy.ken.impl;

import com.bjc.protoss.dp.module.strategy.ken.Strategy;

public class Plus implements Strategy {

	@Override
	public double algorithm(double... inputs) {
		assert (inputs.length > 1);
		double result = 1;
		for (double input : inputs) {
			result = result * input;
		}
		return result;
	}

}
