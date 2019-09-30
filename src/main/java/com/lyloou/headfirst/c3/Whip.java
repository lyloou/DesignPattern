package com.lyloou.headfirst.c3;

/**
 * @author lyloou
 * @date 2019/09/30 21:11
 */
public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.10 + this.beverage.cost();
    }
}
