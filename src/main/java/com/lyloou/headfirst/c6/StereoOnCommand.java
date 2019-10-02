package com.lyloou.headfirst.c6;

/**
 * @author lyloou
 * @date 2019/10/02 15:05
 */
public class StereoOnCommand implements Command {
    private Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        this.stereo.on();
        this.stereo.setCD();
        this.stereo.setVolume(11);
    }
}
