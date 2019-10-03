package com.lyloou.headfirst.c8;

/**
 * @author lyloou
 * @date 2019/10/03 20:38
 */
public class Tea extends Beverage {
    @Override
    protected void addCondiments() {
        System.out.println("Adding Lemon...");
    }

    @Override
    protected void brew() {
        System.out.println("Steeping the tea...");
    }
}
