package com.lyloou.sample._2AbstractFactory;

public class ShapeFactory extends AbstractFactory {
    public Shape getShape(String str) {
        if (str.equalsIgnoreCase("Circle"))
            return new Circle();
        if (str.equalsIgnoreCase("rectangle"))
            return new Rectangle();
        if (str.equalsIgnoreCase("Square"))
            return new Square();

        return null;
    }

    @Override
    Color getColor(String str) {
        return null;
    }
}
