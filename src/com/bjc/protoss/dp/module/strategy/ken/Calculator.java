package com.bjc.protoss.dp.module.strategy.ken;

public class Calculator {
	private Strategy strategy;

	public Calculator(Strategy strategy) {
		this.strategy = strategy;
	}

	public double calculate(double... inputs) {
		return strategy.algorithm(inputs);
	}
}
