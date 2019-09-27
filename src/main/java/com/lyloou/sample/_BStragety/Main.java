package com.lyloou.sample._BStragety;

public class Main {
    public static void main(String[] args) {
        XiaomingStrategy xiaomingStrategy = new XiaomingStrategy();
        PapaStrategy papaStrategy = new PapaStrategy();
        MamaStrategy mamaStrategy = new MamaStrategy();

        // 小明打招呼
        Context context = new Context(xiaomingStrategy);
        context.greet();
        // 爸爸打招呼
        context.setStrategy(papaStrategy);
        context.greet();
        // 妈妈打招呼
        context.setStrategy(mamaStrategy);
        context.greet();

        context.setStrategy(new GreetStrategy() {
            @Override
            public void greet() {
                System.out.println("神出鬼没的招呼打过来，诶，好怕怕");
            }
        });
        context.greet();
    }
}
