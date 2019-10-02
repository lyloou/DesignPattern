package com.lyloou.headfirst.c5;

/**
 * @author lyloou
 * @date 2019/10/02 10:17
 */
public class StaticSingleton {
    private static StaticSingleton instance = new StaticSingleton();

    private StaticSingleton() {
    }

    public static StaticSingleton getInstance() {
        return instance;
    }

    public void server() {
        System.out.println(this.getClass().getSimpleName() + ": you are the god!");
    }
}
