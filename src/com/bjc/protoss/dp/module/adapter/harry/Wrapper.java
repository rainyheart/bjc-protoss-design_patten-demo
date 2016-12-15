package com.bjc.protoss.dp.module.adapter.harry;

import com.bjc.protoss.dp.module.adapter.harry.Source;
import com.bjc.protoss.dp.module.adapter.harry.Targetable;

/**
 * Created by zhexzhi on 12/15/2016.
 */
public class Wrapper implements Targetable {

    private Source source;

    public Wrapper(Source source){
        super();
        this.source = source;
    }
    @Override
    public void method2() {
        System.out.println("this is the Wrapper implemented targetable method!");
    }

    @Override
    public void method1() {
        source.method1();
    }
}
