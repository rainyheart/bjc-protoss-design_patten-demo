package com.bjc.protoss.dp.harry;

import com.bjc.protoss.dp.module.decorator.harry.*;

/**
 * Created by zhexzhi on 2016/12/14.
 */
public class DecoratorTest {

    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable obj = new Decorator(source);
        obj.method();
    }

}
