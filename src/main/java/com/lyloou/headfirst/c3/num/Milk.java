package com.lyloou.headfirst.c3.num;

import java.util.List;

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
    public List<String> getSkus() {
        List<String> list = this.beverage.getSkus();
        list.add(("Milk"));
        return list;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.10;
    }
}
