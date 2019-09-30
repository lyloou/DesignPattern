package com.lyloou.headfirst.c3;

/**
 * @author lyloou
 * @date 2019/09/30 21:11
 */
public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + this.beverage.cost();
    }
}
