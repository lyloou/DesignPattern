package com.lyloou.sample._BStragety;

public class PapaStrategy implements GreetStrategy {
    @Override
    public void greet() {
        System.out.println("握手示意，“好久不见”");
    }
}
