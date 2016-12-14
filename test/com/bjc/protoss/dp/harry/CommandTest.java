package com.bjc.protoss.dp.harry;

import com.bjc.protoss.dp.module.command.harry.Command;
import com.bjc.protoss.dp.module.command.harry.Invoker;
import com.bjc.protoss.dp.module.command.harry.MyCommand;
import com.bjc.protoss.dp.module.command.harry.Receiver;

/**
 * Created by zhexzhi on 2016/12/14.
 */
public class CommandTest {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command cmd = new MyCommand(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}
