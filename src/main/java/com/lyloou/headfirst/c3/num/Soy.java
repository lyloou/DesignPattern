package com.lyloou.headfirst.c3.num;

import java.util.List;

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
    public List<String> getSkus() {
        List<String> list = this.beverage.getSkus();
        list.add(("Soy"));
        return list;
    }

    @Override
    public double cost() {
        return 0.15 + this.beverage.cost();
    }
}
