package com.bjc.protoss.dp.ken;

import org.junit.Test;

import com.bjc.protoss.dp.module.observer.ken.Subject;
import com.bjc.protoss.dp.module.observer.ken.impl.News;
import com.bjc.protoss.dp.module.observer.ken.impl.Sina;
import com.bjc.protoss.dp.module.observer.ken.impl.Tencent;
import com.bjc.protoss.dp.module.observer.ken.impl.Times;
import com.bjc.protoss.dp.module.observer.ken.impl.WhiteHouse;

/**
 *
 * Definition:<br/>
 * Observer pattern is used when there is one-to-many relationship between
 * objects such as if one object is modified, its dependent objects are to be
 * notified automatically. Observer pattern falls under behavioral pattern
 * category.
 *
 */
public class Observer {

	@Test
	public void execute() {
		com.bjc.protoss.dp.module.observer.ken.Observer<String> sina = new Sina<String>();
		com.bjc.protoss.dp.module.observer.ken.Observer<String> tencent = new Tencent<String>();
		com.bjc.protoss.dp.module.observer.ken.Observer<String> times = new Times<String>();

		Subject<String> whiteHouse = new WhiteHouse<String>();
		whiteHouse.register(sina);
		whiteHouse.register(tencent);
		whiteHouse.register(times);

		whiteHouse.notifyObservers(new News("Donald Trump has just won the election of 2016!"));
	}
}
