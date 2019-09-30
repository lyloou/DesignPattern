package com.lyloou.headfirst.c3;

/**
 * @author lyloou
 * @date 2019/09/30 21:11
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.15 + this.beverage.cost();
    }
}
