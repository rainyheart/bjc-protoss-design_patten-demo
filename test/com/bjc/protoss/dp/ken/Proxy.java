package com.bjc.protoss.dp.ken;

import org.junit.Test;

import com.bjc.protoss.dp.module.proxy.wesley.DataCache;
import com.bjc.protoss.dp.module.proxy.wesley.impl.RedisShardProxy;

/**
 * 
 * Proxy pattern provides a surrogate or placeholder for another object to control access to it.
 *
 */

public class Proxy {
	
	@Test
	public void accessProxy(){
		DataCache proxy = new RedisShardProxy();
		System.out.println("calling proxy:" );
		System.out.println(proxy.getName());

		System.out.println("calling proxy:" );
		System.out.println(proxy.getName());

		System.out.println("calling proxy:" );
		System.out.println(proxy.getName());

		System.out.println("calling proxy:" );
		System.out.println(proxy.getName());
}

}
