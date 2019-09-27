package com.lyloou.sample._7Builder;

public class Main {
    public static void main(String[] args) {
        Builder builder = new BenzBuilder();
        Director director = new Director(builder);
        Car car = director.createCar("风火轮", "超级牛逼", "甲壳虫");
        car.run();
    }
}
