package com.lyloou.sample._2AbstractFactory;

public class Square implements Shape {

    @Override
    public void draw(String str) {
        System.out.println("Square===" + str);
    }

}
