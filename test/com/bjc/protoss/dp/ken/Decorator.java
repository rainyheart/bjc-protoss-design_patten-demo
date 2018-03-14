package com.bjc.protoss.dp.ken;

import org.junit.Test;

import com.bjc.protoss.dp.module.decorator.wesley.DataCache;
import com.bjc.protoss.dp.module.decorator.wesley.impl.Redis;
import com.bjc.protoss.dp.module.decorator.wesley.impl.RedisDecorator;

/**
 *
 * Definition:<br/>
 * Decorator attaches additional responsibilities to an object
 * dynamically. Decorators
 * provide a flexible alternative to subclassing for extending
 * functionality.
 *
 * The pre-condiction is that existing interface should not be
 * changed, and it's required
 * to supplement functions to existing implementations.
 *
 */
public class Decorator {

    @Test
    public void getSetCache() {
        DataCache cache = new Redis();

        cache.setValue("price of rice", "19.8");
        System.out.println("Cached price of rice = " + cache.getValue("price of rice"));

        DataCache decorator = new RedisDecorator(cache);
        System.out.println("Cached price of rice = " + decorator.getValue("price of rice"));
        decorator.setValue("price of rice", "36.2");
        System.out.println("Cached price of rice = " + decorator.getValue("price of rice"));

        System.out.println("Cached price of rice = " + cache.getValue("price of rice"));
    }

}
