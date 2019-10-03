package com.lyloou.headfirst.c8;

/**
 * @author lyloou
 * @date 2019/10/03 20:42
 */
public class Coffee extends Beverage {
    @Override
    protected void addCondiments() {
        System.out.println("Add Mild and Sugar...");
    }

    @Override
    protected void brew() {
        System.out.println("Dripping Coffee through filter...");
    }
}
