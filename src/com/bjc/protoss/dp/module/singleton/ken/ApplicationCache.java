/*------------------------------------------------------------------------------
 * COPYRIGHT BJC 2018
 *
 * The copyright to the computer program(s) herein is the property of
 * BJC Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.bjc.protoss.dp.module.singleton.ken;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class ApplicationCache {

    private static Map<Object, Object> cachedValue;

    private static volatile ApplicationCache instance = null;

    private ApplicationCache() {
        super();
        cachedValue = new HashMap<Object, Object>();
    }

    public static final ApplicationCache getInstance() {
        if (instance == null) {
            synchronized (ApplicationCache.class) {
                if (instance == null) {
                    instance = new ApplicationCache();
                }
            }
        }

        return instance;
    }

    public void asyncPut(Object key, Object value) {
        ApplicationCache.cachedValue.put(key, value);
    }

    public void syncPut(Object key, Object value) {
        synchronized (ApplicationCache.class) {
            ApplicationCache.cachedValue.put(key, value);
        }
    }

    public Object asyncGet(Object key) {
        return ApplicationCache.cachedValue.get(key);
    }

    public Object syncGet(Object key) {
        synchronized (ApplicationCache.class) {
            return ApplicationCache.cachedValue.get(key);
        }
    }

    public void print() {
        synchronized (ApplicationCache.class) {
            for (Entry<Object, Object> entry : cachedValue.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
