package com.lyloou.headfirst.c3;

/**
 * @author lyloou
 * @date 2019/09/30 21:11
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.10;
    }
}
