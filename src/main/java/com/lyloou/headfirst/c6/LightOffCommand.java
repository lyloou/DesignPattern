package com.lyloou.headfirst.c6;

/**
 * @author lyloou
 * @date 2019/10/02 14:44
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
    }
}
