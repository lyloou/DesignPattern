package com.lyloou.sample._2AbstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory af;
        Color color;
        Shape shape;
        // 生产「绿」。
        af = FactoryProducer.getFactory("ColorFactory");
        color = af.getColor("GREEN");
        color.draw();

        // 生产「圆」
        af = FactoryProducer.getFactory("SimpleFactory");
        shape = af.getShape("Rectangle");
        shape.draw("2");

    }
}
