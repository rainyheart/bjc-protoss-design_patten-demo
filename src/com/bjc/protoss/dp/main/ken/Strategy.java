package com.bjc.protoss.dp.main.ken;

import com.bjc.protoss.dp.module.strategy.ken.Calculator;
import com.bjc.protoss.dp.module.strategy.ken.impl.Add;
import com.bjc.protoss.dp.module.strategy.ken.impl.Divide;
import com.bjc.protoss.dp.module.strategy.ken.impl.Minus;
import com.bjc.protoss.dp.module.strategy.ken.impl.Plus;

public class Strategy {
	public static void main(String[] args) {
		add(1, 2, 3, 4, 5, 6);
		minus(100, 99);
		plus(1, 2, 3, 4, 5);
		divide(10, 3);
	}

	private static void add(double... inputs) {
		calculate(new Add(), inputs);
	}

	private static void minus(double... inputs) {
		calculate(new Minus(), inputs);
	}

	private static void plus(double... inputs) {
		calculate(new Plus(), inputs);
	}

	private static void divide(double... inputs) {
		calculate(new Divide(), inputs);
	}

	private static void calculate(com.bjc.protoss.dp.module.strategy.ken.Strategy strategy, double... inputs) {
		Calculator calculator = new Calculator(strategy);

		System.out.println(calculator.calculate(inputs));
	}
}
