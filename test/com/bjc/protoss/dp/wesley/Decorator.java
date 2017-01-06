package com.bjc.protoss.dp.wesley;

import org.junit.Test;

import com.bjc.protoss.dp.module.decorator.wesley.DataCache;
import com.bjc.protoss.dp.module.decorator.wesley.impl.Redis;
import com.bjc.protoss.dp.module.decorator.wesley.impl.RedisDecorator;

/**
 * 
 * Decorator attaches additional responsibilities to an object dynamically. Decorators
 * provide a flexible alternative to subclassing for extending functionality.
 * 
 * The pre-condiction is that existing interface should not be changed, and it's required
 * to supplement functions to existing implementations.
 *
 */
public class Decorator {
	
	@Test
	public void getSetCache(){
		DataCache cache = new Redis();
		
		cache.setValue("name", "Wesley");
		System.out.println("value=" + cache.getValue("name"));
		
		DataCache decorator = new RedisDecorator(cache);
		System.out.println("value=" + decorator.getValue("name"));
		decorator.setValue("name", "Decorator");
		System.out.println("value=" + decorator.getValue("name"));
		
		System.out.println("value=" + cache.getValue("name"));
	}

}
