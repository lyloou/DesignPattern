package com.lyloou.headfirst.c10;

/**
 * @author lyloou
 * @date 2019/10/04 14:19
 */
public class Main {
    public static void main(String[] args) {
        // test1();
        test2();
    }

    private static void test1() {
        GumballMachine machine = new GumballMachine(5);
        machine.insertQuarter();
        machine.turnCrack();

        machine.insertQuarter();
        machine.ejectQuarter();
        machine.ejectQuarter();
        machine.turnCrack();
    }

    private static void test2() {
        GumballMachine machine = new GumballMachine(5);

        for (int i = 0; i < 10; i++) {
            machine.insertQuarter();
            machine.turnCrack();
        }

        System.out.println();
        machine.refill(2);
        machine.insertQuarter();
        machine.turnCrack();
    }
}
