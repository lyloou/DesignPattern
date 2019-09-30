package com.lyloou.headfirst.c3;

/**
 * @author lyloou
 * @date 2019/09/30 21:15
 */
public class Main {
    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();
        beverage = new Soy(beverage);
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());

    }
}
