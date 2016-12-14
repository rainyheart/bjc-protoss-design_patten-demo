package com.bjc.protoss.dp.module.command.harry;

/**
 * Created by zhexzhi on 2016/12/14.
 */
/*the Command for turning on the light*/
public class TurnOnCommand implements Command {

    private Light theLight;

    public TurnOnCommand(Light light) {
        this.theLight=light;
    }

    public void execute(){
        theLight.turnOn();
    }
}
