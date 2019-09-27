package com.lyloou.sample._2AbstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String str) {
        if (str.equalsIgnoreCase("SimpleFactory")) {
            return new ShapeFactory();
        }

        if (str.equalsIgnoreCase("ColorFactory")) {
            return new ColorFactory();
        }
        return null;
    }
}
