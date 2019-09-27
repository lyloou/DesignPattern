package com.lyloou.sample._8Decorator;

public class Main {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        BgmMonkey bgmMonkey = new BgmMonkey(monkey);
        bgmMonkey.fight();

        System.out.println();


        new Fighter(monkey) {
            @Override
            public void fight() {
                System.out.println("观众围观。。。");
                System.out.println("士气十足。。。");
                super.fight();
                System.out.println("打趴下");
                System.out.println("Game Over！");
            }
        }.fight();
    }
}
