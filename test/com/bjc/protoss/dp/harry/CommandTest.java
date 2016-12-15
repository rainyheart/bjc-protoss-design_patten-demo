package com.bjc.protoss.dp.harry;

import com.bjc.protoss.dp.module.command.harry.Command;
import com.bjc.protoss.dp.module.command.harry.TrunOffCommand;
import com.bjc.protoss.dp.module.command.harry.Switch;
import com.bjc.protoss.dp.module.command.harry.TurnOnCommand;
import com.bjc.protoss.dp.module.command.harry.Light;

/**
 * Created by zhexzhi on 12/14/2016.
 * 命令模式的用法多种多样，但总离不开三个角色和一个对象: 调用者、接受者、
 * 客户端，和命令对象(command object).
 * 调用者决定命令执行的时机，即它是命令的发起者；它不知道命令的执行细节，只管发起。
 * 接受者是真正执行命令的对象。
 * 命令对象是实现命令接口的对象，命令对象往往封装或引用了接收者。
 * 客户端负责初始化调用者、接收者、命令对象以及提供必要的信息（参数），
 * 一旦初始化完毕，各个对象的联系通路也就建立起来了。
 */
public class CommandTest {

    public static void main(String[] args) {

        Light lamp = new Light();

        Command turnOn = new TurnOnCommand(lamp);
        Command turnOff = new TrunOffCommand(lamp);

        Switch s = new Switch(turnOn, turnOff);

//        s.turnOn();
//        s.turnOff();

        try {
            if (args[0].equalsIgnoreCase("ON")) {
                s.turnOn();
            } else if (args[0].equalsIgnoreCase("OFF")) {
                s.turnOff();
            } else {
                System.out.println("Argument \"ON\" or \"OFF\" is required.");
            }
        } catch (Exception e) {
            System.out.println("Arguments required.");
        }
    }
}
