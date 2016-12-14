package com.bjc.protoss.dp.module.decorator.harry;

/**
 * Created by zhexzhi on 2016/12/14.
 * 装饰类
 */
public class Decorator implements Sourceable {

    private Sourceable source;

    public Decorator(Sourceable source){
        super();
        this.source = source;
    }
    @Override
    public void method() {

        System.out.println("add some function before source!");

        source.method();

        System.out.println("add some function after source!");
    }
}
