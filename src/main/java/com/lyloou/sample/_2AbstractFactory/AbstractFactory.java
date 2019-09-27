package com.lyloou.sample._2AbstractFactory;

public abstract class AbstractFactory {
    abstract Color getColor(String str);

    abstract Shape getShape(String str);
}
