package com.lyloou.headfirst.c3;

/**
 * @author lyloou
 * @date 2019/09/30 21:08
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
