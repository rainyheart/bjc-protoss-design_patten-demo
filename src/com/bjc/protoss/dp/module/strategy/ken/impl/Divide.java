package com.bjc.protoss.dp.module.strategy.ken.impl;

import com.bjc.protoss.dp.module.strategy.ken.Strategy;

public class Divide implements Strategy
{

	@Override
	public double algorithm(double... inputs)
	{
		assert(inputs.length == 2);
		return inputs[0] / inputs[1];
	}

}
