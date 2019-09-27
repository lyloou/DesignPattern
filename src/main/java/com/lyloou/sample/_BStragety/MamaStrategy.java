package com.lyloou.sample._BStragety;

public class MamaStrategy implements GreetStrategy {
    @Override
    public void greet() {
        System.out.println("先来个拥抱，真的好多年不见啊，怪想你的");
    }
}
