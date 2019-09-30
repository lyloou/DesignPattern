package com.lyloou.headfirst.c3.num;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
        beverage.setSize(2);
        Map<String, List<String>> collect = beverage.getSkus().stream().collect(Collectors.groupingBy(sku -> sku));
        Map<String, Integer> nums = new HashMap<>();
        collect.forEach((s, skus) -> {
            nums.put(s, skus.size());
        });
        System.out.println(nums);
        System.out.println(beverage.cost() + cupCost(beverage.getSize()));

    }

    private static double cupCost(int size) {
        if (size == 0) {
            return 0.10;
        }
        if (size == 1) {
            return 0.15;
        }
        if (size == 2) {
            return 0.20;
        }
        return 99999;
    }
}
