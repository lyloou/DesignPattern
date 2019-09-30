package com.lyloou.headfirst.c3.num;

/**
 * @author lyloou
 * @date 2019/09/30 21:09
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        list.add(("Dark Roast"));
    }


    @Override
    public double cost() {
        return 0.99;
    }
}
