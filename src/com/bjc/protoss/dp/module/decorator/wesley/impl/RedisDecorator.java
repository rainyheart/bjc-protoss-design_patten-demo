package com.bjc.protoss.dp.module.decorator.wesley.impl;

import com.bjc.protoss.dp.module.decorator.wesley.DataCache;

public class RedisDecorator implements DataCache {

    private DataCache cache = null;
    private static int setOperation = 0;
    private static int getOperation = 0;

    public RedisDecorator(DataCache cache) {
        this.cache = cache;
    }

    @Override
    public String setValue(String key, String value) {
        String result = cache.setValue(key, value);
        System.out.println("*** Log [RedisDecorator set operation accumulated count:" + ++setOperation + "]");
        return result;
    }

    @Override
    public String getValue(String key) {
        String result = cache.getValue(key);
        System.out.println("*** Log [RedisDecorator get operation accumulated count:" + ++getOperation + "]");
        return result;
    }

}
