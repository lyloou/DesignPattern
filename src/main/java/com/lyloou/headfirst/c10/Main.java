package com.lyloou.headfirst.c10;

/**
 * @author lyloou
 * @date 2019/10/04 14:19
 */
public class Main {
    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine(5);
        machine.insertQuarter();
        machine.turnCrack();

        machine.insertQuarter();
        machine.ejectQuarter();
        machine.ejectQuarter();
        machine.turnCrack();
    }
}
