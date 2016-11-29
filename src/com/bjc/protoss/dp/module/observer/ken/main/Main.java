package com.bjc.protoss.dp.module.observer.ken.main;

import com.bjc.protoss.dp.module.observer.ken.Observer;
import com.bjc.protoss.dp.module.observer.ken.impl.News;
import com.bjc.protoss.dp.module.observer.ken.impl.Sina;
import com.bjc.protoss.dp.module.observer.ken.impl.Tencent;
import com.bjc.protoss.dp.module.observer.ken.impl.Times;
import com.bjc.protoss.dp.module.observer.ken.impl.WhiteHouse;

public class Main {
	public static void main(String[] args) {
		Observer sina = new Sina();
		Observer tencent = new Tencent();
		Observer times = new Times();

		WhiteHouse whiteHouse = new WhiteHouse();
		whiteHouse.register(sina);
		whiteHouse.register(tencent);
		whiteHouse.register(times);

		whiteHouse.notifyObservers(new News("Donald Trump has just won the election of 2016!"));
	}
}
