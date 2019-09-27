package com.lyloou.sample._DObserver;

public class Main {
    public static void main(String[] args) {
        User h = new User("小红");
        User m = new User("小明");
        User q = new User("小强");

        Homilist homilist = new Homilist();
        homilist.attach(h);
        homilist.attach(m);
        homilist.attach(q);
        homilist.notify("你是我的粉丝，我是你的布道者，布谷，布谷。布谷，布谷。");

        System.out.println("裁员：");
        homilist.remove(q);
        homilist.remove(m);
        homilist.notify("剩下的你是精英");
    }
}
