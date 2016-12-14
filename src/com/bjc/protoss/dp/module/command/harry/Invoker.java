package com.bjc.protoss.dp.module.command.harry;

/**
 * Created by zhexzhi on 2016/12/14.
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.exec();
    }
}
