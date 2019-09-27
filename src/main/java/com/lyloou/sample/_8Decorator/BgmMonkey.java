package com.lyloou.sample._8Decorator;

public class BgmMonkey extends Fighter {
    public BgmMonkey(Animal animal) {
        super(animal);
    }

    @Override
    public void fight() {
        System.out.println("伴随着BGM。。。");
        super.fight();
    }
}
