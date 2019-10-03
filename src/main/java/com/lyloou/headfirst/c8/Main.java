package com.lyloou.headfirst.c8;

/**
 * @author lyloou
 * @date 2019/10/03 20:43
 */
public class Main {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        tea.prepareRecipe();

        System.out.println();

        Beverage coffee = new Coffee();
        coffee.prepareRecipe();
    }

}
