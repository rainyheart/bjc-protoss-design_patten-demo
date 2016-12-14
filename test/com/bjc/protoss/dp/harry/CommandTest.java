package com.bjc.protoss.dp.harry;

import com.bjc.protoss.dp.module.command.harry.Command;
import com.bjc.protoss.dp.module.command.harry.TrunOffCommand;
import com.bjc.protoss.dp.module.command.harry.Switch;
import com.bjc.protoss.dp.module.command.harry.TurnOnCommand;
import com.bjc.protoss.dp.module.command.harry.Light;

/**
 * Created by zhexzhi on 2016/12/14.
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
