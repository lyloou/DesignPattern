package com.lyloou.headfirst.c3.num;

import java.util.List;

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
    public List<String> getSkus() {
        List<String> list = this.beverage.getSkus();
        list.add(("Mocha"));
        return list;
    }

    @Override
    public double cost() {
        return 0.20 + this.beverage.cost();
    }
}
