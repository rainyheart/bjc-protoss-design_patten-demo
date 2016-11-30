package com.bjc.protoss.dp.main.ken;

import com.bjc.protoss.dp.module.observer.ken.impl.News;
import com.bjc.protoss.dp.module.observer.ken.impl.Sina;
import com.bjc.protoss.dp.module.observer.ken.impl.Tencent;
import com.bjc.protoss.dp.module.observer.ken.impl.Times;
import com.bjc.protoss.dp.module.observer.ken.impl.WhiteHouse;

public class Observer {
	public static void main(String[] args) {
		com.bjc.protoss.dp.module.observer.ken.Observer sina = new Sina();
		com.bjc.protoss.dp.module.observer.ken.Observer tencent = new Tencent();
		com.bjc.protoss.dp.module.observer.ken.Observer times = new Times();

		WhiteHouse whiteHouse = new WhiteHouse();
		whiteHouse.register(sina);
		whiteHouse.register(tencent);
		whiteHouse.register(times);

		whiteHouse.notifyObservers(new News("Donald Trump has just won the election of 2016!"));
	}
}
