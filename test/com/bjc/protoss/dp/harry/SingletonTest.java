package com.bjc.protoss.dp.harry;

import com.bjc.protoss.dp.module.singleton.harry.Singleton;

/**
 * Created by zhexzhi on 12/14/2016.
 * 单例对象（Singleton）是一种常用的设计模式。在Java应用中，单例对象能保证在一个JVM中，该对象只有一个实例存在。
 * 这样的模式有几个好处：
 * 1、某些类创建比较频繁，对于一些大型的对象，这是一笔很大的系统开销。
 * 2、省去了new操作符，降低了系统内存的使用频率，减轻GC压力。
 * 3、有些类如交易所的核心交易引擎，控制着交易流程，如果该类可以创建多个的话，系统完全乱了。
 */
public class SingletonTest {

    public static void main(String[] args) {

        Singleton.getInstance2();
        Singleton.getInstance1();
        Singleton.getInstance();

    }
}
