package com.lyloou.sample._DObserver;

import java.util.ArrayList;
import java.util.List;

public class Homilist implements Subject {
    List<Observer> list = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        list.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notify(String message) {
        list.forEach(observer -> observer.update(message));
    }
}
