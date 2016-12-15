package com.bjc.protoss.dp.module.decorator.harry;

/**
 * Created by zhexzhi on 12/14/2016.
 * 被装饰类
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
