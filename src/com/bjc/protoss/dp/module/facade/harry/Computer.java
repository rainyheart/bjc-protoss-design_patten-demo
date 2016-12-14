package com.bjc.protoss.dp.module.facade.harry;

/**
 * Created by zhexzhi on 2016/12/14.
 * 外观模式是为了解决类与类之家的依赖关系的,
 * 就是类的关系放在一个Facade类中，降低了类类之间的耦合度
 */
public class Computer {
    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer(){
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    public void startup(){
        System.out.println("start the computer!");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("start computer finished!");
    }

    public void shutdown(){
        System.out.println("begin to close the computer!");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("computer closed!");
    }
}
