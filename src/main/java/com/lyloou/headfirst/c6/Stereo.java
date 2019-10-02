package com.lyloou.headfirst.c6;

/**
 * @author lyloou
 * @date 2019/10/02 15:01
 */
public class Stereo {
    private String name;
    private int volume;

    public Stereo(String name) {
        this.name = name;
    }

    public void setCD() {
        System.out.println("set cd");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("set volume " + this.volume);
    }

    public void on() {
        System.out.println(String.format("the %s stereo is on, with %s volume", this.name, this.volume));
    }

    public void off() {
        System.out.println(String.format("the %s stereo is off, with %s volume", this.name, this.volume));
    }
}
