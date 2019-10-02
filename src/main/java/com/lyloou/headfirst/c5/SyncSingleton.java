package com.lyloou.headfirst.c5;

/**
 * @author lyloou
 * @date 2019/10/02 10:18
 */
public class SyncSingleton {
    private static SyncSingleton instance;

    private SyncSingleton() {
    }

    public static synchronized SyncSingleton getInstance() {
        if (instance == null) {
            instance = new SyncSingleton();
        }
        return instance;
    }

    public void server() {
        System.out.println(this.getClass().getSimpleName() + ": you are the god!");
    }
}
