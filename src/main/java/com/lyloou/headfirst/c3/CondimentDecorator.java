package com.lyloou.headfirst.c3;

/**
 * @author lyloou
 * @date 2019/09/30 21:06
 */
public abstract class CondimentDecorator extends Beverage {
    /**
     * 获取描述信息
     *
     * @return 描述信息
     */
    @Override
    public abstract String getDescription();
}
