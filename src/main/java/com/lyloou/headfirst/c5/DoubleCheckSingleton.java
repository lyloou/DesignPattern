package com.lyloou.headfirst.c5;

/**
 * @author lyloou
 * @date 2019/10/02 10:13
 */
public class DoubleCheckSingleton {
    private volatile static DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }

    public void server() {
        System.out.println(this.getClass().getSimpleName() + ": you are the god!");
    }
}
