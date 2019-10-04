package com.lyloou.headfirst.c10;

/**
 * @author lyloou
 * @date 2019/10/04 14:02
 */
public class WinState implements State {
    private GumballMachine gumballMachine;

    public WinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turn twice doesn't get you another gumball");
    }

    @Override
    public void dispense() {
        System.out.println("You are winner! You get two gumballs for your quarter");
        // first release
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            // second release
            gumballMachine.releaseBall();
        }

        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
