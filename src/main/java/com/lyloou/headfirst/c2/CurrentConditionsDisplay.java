package com.lyloou.headfirst.c2;

public class CurrentConditionsDisplay implements Observer {
    Subject subject;

    public CurrentConditionsDisplay(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public <Data> void update(Data data) {
        System.out.println("from currentconditions:");
        System.out.println(data);
    }
}
