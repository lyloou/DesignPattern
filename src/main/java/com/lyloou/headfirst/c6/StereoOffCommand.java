package com.lyloou.headfirst.c6;

/**
 * @author lyloou
 * @date 2019/10/02 15:05
 */
public class StereoOffCommand implements Command {
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        this.stereo.off();
    }
}
