package com.lyloou.headfirst.c3.num;

/**
 * @author lyloou
 * @date 2019/09/30 21:10
 */
public class Decaf extends Beverage {
    public Decaf() {
        list.add(("Decaf"));
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
