package com.lyloou.sample._6Observer;

import java.util.Observable;
import java.util.Observer;

public class Main {
    public static void main(String[] args) {
        Observable0 o = new Observable0();
        // 添加观察者
//		o.addObserver(null); // 将会抛出NullPointerException异常
        Observer1 o1 = new Observer1();
        o.addObserver(o1);
        o.addObserver(new Observer2());
        o.addObserver(new Observer() {

            @Override
            public void update(Observable o, Object arg) {
                String a = (String) arg;
                System.out.println("update in Observer3: " + a);
            }
        });
        o.sendMessage("Hello");

        // 删除观察者
        o.deleteObserver(o1);
        System.out.println("=============");
        o.sendMessage("World");

    }
}/* Output:
update in Observer3: Hello
update in Observer2: Hello
update in Observer1: Hello
Observable is instanceof Observalbe0:true
=============
update in Observer3: World
update in Observer2: World
*///~

////////////////////////////////
// 观察者
////////////////////////////////
class Observer1 implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        String a = (String) arg;
        System.out.println("update in Observer1: " + a);

        System.out.println("Observable is instanceof Observalbe0:" + (o instanceof Observable0));
    }
}

class Observer2 implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        String a = (String) arg;
        System.out.println("update in Observer2: " + a);
    }
}


////////////////////////////////
// 被观察者
////////////////////////////////
class Observable0 extends Observable {
    public void sendMessage(String msg) {
        setChanged(); // 改变状态，保证调用notifyObservers()时会执行观察者的update()方法；（具体参考Observable源码）
        notifyObservers(msg);

        setChanged();
        notifyObservers();
    }
}