package com.lyloou.headfirst.c10;

/**
 * @author lyloou
 * @date 2019/10/04 14:01
 */
public interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
