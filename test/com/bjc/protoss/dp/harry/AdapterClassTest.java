package com.bjc.protoss.dp.harry;

import com.bjc.protoss.dp.module.adapter.harry.Adapter;
import com.bjc.protoss.dp.module.adapter.harry.Targetable;

/**
 * Created by zhexzhi on 12/15/2016.
 核心思想就是：有一个Source类，拥有一个方法，待适配，
 目标接口时Targetable，通过Adapter类，将Source的功能扩展到Targetable里
 */
public class AdapterClassTest {

    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }
}
