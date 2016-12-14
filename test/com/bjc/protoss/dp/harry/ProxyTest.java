package com.bjc.protoss.dp.harry;

import com.bjc.protoss.dp.module.proxy.harry.Proxy;
import com.bjc.protoss.dp.module.proxy.harry.Sourceable;

/**
 * Created by zhexzhi on 2016/12/14.
 */
public class ProxyTest {

    public static void main(String[] args) {
        Sourceable source = new Proxy();
        source.method();
    }

}
