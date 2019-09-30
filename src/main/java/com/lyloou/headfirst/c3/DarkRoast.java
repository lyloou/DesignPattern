package com.lyloou.headfirst.c3;

/**
 * @author lyloou
 * @date 2019/09/30 21:09
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }


    @Override
    public double cost() {
        return 0.99;
    }
}
