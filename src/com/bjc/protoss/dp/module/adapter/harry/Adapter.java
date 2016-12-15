package com.bjc.protoss.dp.module.adapter.harry;

/**
 * Created by zhexzhi on 12/15/2016.
 */
public class Adapter extends Source implements Targetable{

    @Override
    public void method2(){
        System.out.println("this is the targetable method!");
    }

}