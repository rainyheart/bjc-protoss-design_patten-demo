package com.bjc.protoss.dp.harry;

import com.bjc.protoss.dp.module.singleton.harry.Singleton;

/**
 * Created by zhexzhi on 2016/12/14.
 */
public class SingletonTest {

    public static void main(String[] args) {

        Singleton.getInstance2();
        Singleton.getInstance1();
        Singleton.getInstance();

    }
}
