package com.lyloou.sample._AFlyweight;

public class Main {
    public static void main(String[] args) {
        Image plan1 = ImageFactory.getImage("plan1");
        plan1.show("silk");
        plan1 = ImageFactory.getImage("plan1");
        plan1.show("road");
        plan1 = ImageFactory.getImage("plan1");
        plan1.show("road");


        Image plan2 = ImageFactory.getImage("plan2");
        plan2.show("silk");
        plan2 = ImageFactory.getImage("plan2");
        plan2.show("road");
        plan2 = ImageFactory.getImage("plan2");
        plan2.show("road");

    }
}
