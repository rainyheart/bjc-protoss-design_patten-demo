package com.bjc.protoss.dp.module.command.harry;

/**
 * Created by zhexzhi on 2016/12/14.
 */
public class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exec() {
        receiver.action();
    }
}
