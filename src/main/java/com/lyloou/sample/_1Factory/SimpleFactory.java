package com.lyloou.sample._1Factory;

public class SimpleFactory {
    public Shape getShape(String str) {
        System.out.println("\n简单工厂来干事了。。。。");
        switch (str.toLowerCase()) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            default:
                return null;
        }
    }
}
