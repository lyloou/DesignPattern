package com.lyloou.headfirst.c8;

/**
 * @author lyloou
 * @date 2019/10/03 20:38
 */
public abstract class Beverage {
    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void addCondiments();

    protected void pourInCup() {
        System.out.println("Pour In Cup...");
    }

    protected abstract void brew();

    protected void boilWater() {
        System.out.println("Boil Water...");
    }

    ;

}
