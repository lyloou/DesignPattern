package com.lyloou.headfirst.c10;

import java.util.Random;

/**
 * @author lyloou
 * @date 2019/10/04 14:02
 */
public class HasQuarterState implements State {
    private Random randomWinner = new Random(System.currentTimeMillis());

    private GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        this.gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        if (randomWinner.nextInt() % 3 == 0 && gumballMachine.getCount() > 1) {
            gumballMachine.setState(gumballMachine.getWinState());
            return;
        }
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispense");
    }
}
