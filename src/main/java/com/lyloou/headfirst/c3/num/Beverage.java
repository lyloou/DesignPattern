package com.lyloou.headfirst.c3.num;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lyloou
 * @date 2019/09/30 21:03
 */
public abstract class Beverage {

    /**
     * 0：小杯；1：中杯；2：大杯
     */
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    List<String> list = new ArrayList<>();

    public List<String> getSkus() {
        return list;
    }

    /**
     * 获取 beverage 的 价格
     *
     * @return 返回价格
     */
    public abstract double cost();

}
