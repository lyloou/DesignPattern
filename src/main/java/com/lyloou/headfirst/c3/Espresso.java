package com.lyloou.headfirst.c3;

/**
 * @author lyloou
 * @date 2019/09/30 21:10
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
