package com.lyloou.sample._1Factory;

public abstract class AbsFactory {
    public abstract <T extends Shape> T createShape(Class<T> clz);
}
