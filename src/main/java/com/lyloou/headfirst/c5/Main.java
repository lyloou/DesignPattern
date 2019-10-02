package com.lyloou.headfirst.c5;

/**
 * @author lyloou
 * @date 2019/10/02 10:15
 */
public class Main {
    public static void main(String[] args) {
        DoubleCheckSingleton.getInstance().server();
        StaticSingleton.getInstance().server();
        SyncSingleton.getInstance().server();
        EnumSingleton.INSTANCE.server();
    }
}
