package com.lyloou.headfirst.c6;

/**
 * @author lyloou
 * @date 2019/10/02 14:42
 */
public class Light {
    String name;

    public Light(String name) {
        this.name = name;
    }

    public void off() {
        System.out.println(String.format("the %s light is off", this.name));
    }

    public void on() {
        System.out.println(String.format("the %s light is on", this.name));
    }
}
