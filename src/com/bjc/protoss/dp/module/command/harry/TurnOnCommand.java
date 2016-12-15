package com.bjc.protoss.dp.module.command.harry;

/**
 * Created by zhexzhi on 12/14/2016.
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
