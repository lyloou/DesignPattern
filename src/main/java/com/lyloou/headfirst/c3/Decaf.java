package com.lyloou.headfirst.c3;

/**
 * @author lyloou
 * @date 2019/09/30 21:10
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
