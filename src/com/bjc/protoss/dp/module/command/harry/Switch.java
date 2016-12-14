package com.bjc.protoss.dp.module.command.harry;

/**
 * Created by zhexzhi on 2016/12/14.
 */
public class Switch {

    private Command turnOnCommand;
    private Command turnOffCommand;

    public Switch(Command turnOnCmd, Command turnOffCmd) {
        this.turnOnCommand = turnOnCmd;
        this.turnOffCommand = turnOffCmd;
    }

    public void turnOn() {
        turnOnCommand.execute();
    }

    public void turnOff() {
        turnOffCommand.execute();
    }
}
