package com.bjc.protoss.dp.module.command.harry;

/**
 * Created by ZHEXZHI on 12/14/2016.
 */
/*the Command for turning off the light*/
public class TrunOffCommand implements Command {

    private Light theLight;

    public TrunOffCommand(Light light) {
        this.theLight=light;
    }

    public void execute() {
        theLight.turnOff();
    }
}