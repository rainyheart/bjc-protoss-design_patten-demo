package com.bjc.protoss.dp.module.template.harry;

/**
 * Created by zhexzhi on 2016/12/14.
 *
 */
public abstract class Template {

    //模板方法
    public final void work(){

        method1();
        method2();//勾子方法
        method3();//抽象方法
    }

    private void method1(){
        System.out.println("父类实现业务逻辑");
    }

    public void method2(){
        System.out.println("父类默认实现，子类可覆盖");
    }

    protected abstract void method3();//子类负责实现业务逻辑
}
