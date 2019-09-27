package com.lyloou.sample._2AbstractFactory;

public class ColorFactory extends AbstractFactory {
    public Color getColor(String str) {
        if (str.equalsIgnoreCase("RED"))
            return new Red();
        if (str.equalsIgnoreCase("GREEN"))
            return new Green();
        if (str.equalsIgnoreCase("BLUE"))
            return new Blue();

        return null;
    }

    @Override
    Shape getShape(String str) {
        return null;
    }
}
