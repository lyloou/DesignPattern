package com.lyloou.headfirst.c10;

/**
 * @author lyloou
 * @date 2019/10/04 14:02
 */
public class SoldOutState implements State {
    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Sorry, sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, sold out");
    }

    @Override
    public void turnCrank() {
        System.out.println("Sorry, sold out");
    }

    @Override
    public void dispense() {
        System.out.println("Sorry, sold out");
    }
}
