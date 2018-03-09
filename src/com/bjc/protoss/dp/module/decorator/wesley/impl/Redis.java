package com.bjc.protoss.dp.module.decorator.wesley.impl;

import java.util.HashMap;
import java.util.Map;

import com.bjc.protoss.dp.module.decorator.wesley.DataCache;

public class Redis implements DataCache {

    Map<String, String> cache = new HashMap<>();

    @Override
    public String setValue(String key, String value) {
        System.out.println("** Operation [Redis setValue.]");
        cache.put(key, value);
        return value;
    }

    @Override
    public String getValue(String key) {
        System.out.println("** Operation [Redis getValue.]");
        return cache.get(key);
    }

}
