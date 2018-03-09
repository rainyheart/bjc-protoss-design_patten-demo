package com.bjc.protoss.dp.module.facade.wesley.impl;

import java.util.HashMap;
import java.util.Map;

import com.bjc.protoss.dp.module.facade.wesley.DataBase;

public class MySQL implements DataBase {

    private Map<String, String> dataMap = new HashMap<>();

    @Override
    public String setValue(String key, String value) {
        System.out.println("MySQL setValue: " + value);
        return this.dataMap.put(key, value);
    }

    @Override
    public String getValue(String key) {
        System.out.println("MySQL getValue: " + key);
        return this.dataMap.get(key);
    }

}
