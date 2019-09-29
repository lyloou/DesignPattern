package com.lyloou;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<Integer> list = Arrays.asList(1, 8, 9, 2, 8, 9, 6, 5, -1, 23, 99);
        list.sort((o1, o2) -> o2 - o1);
        System.out.println(list);
    }
}
