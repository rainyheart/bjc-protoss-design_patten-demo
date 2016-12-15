package com.bjc.protoss.dp.harry;

import com.bjc.protoss.dp.module.facade.harry.Computer;

/**
 * Created by zhexzhi on 12/14/2016.
 * 外观模式是为了解决类与类之家的依赖关系的,
 * 就是类的关系放在一个Facade类中，降低了类类之间的耦合度
 */
public class FacadeTest {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }

}
