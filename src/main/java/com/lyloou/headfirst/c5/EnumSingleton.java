package com.lyloou.headfirst.c5;

/**
 * @author lyloou
 * @date 2019/10/02 10:21
 */
public enum EnumSingleton {
    /**
     * 实例
     */
    INSTANCE;

    public void server() {
        System.out.println(this.getClass().getSimpleName() + ": you are the god!");
    }
}
