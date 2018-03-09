package com.bjc.protoss.dp.module.facade.wesley.impl;

import java.util.HashMap;
import java.util.Map;

import com.bjc.protoss.dp.module.facade.wesley.DataCache;

public class Redis implements DataCache {

    private Map<String, String> dataMap = new HashMap<>();

    @Override
    public String setValue(String key, String value) {
        System.out.println("Redis setValue: " + value);
        return this.dataMap.put(key, value);
    }

    @Override
    public String getValue(String key) {
        System.out.println("Redis getValue: " + key);
        return this.dataMap.get(key);
    }

}
