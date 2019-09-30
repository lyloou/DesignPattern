package com.lyloou.headfirst.c3;

/**
 * @author lyloou
 * @date 2019/09/30 21:03
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    /**
     * 获取 beverage 的 价格
     *
     * @return 返回价格
     */
    public abstract double cost();

}
