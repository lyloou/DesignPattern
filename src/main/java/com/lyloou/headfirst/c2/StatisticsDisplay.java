package com.lyloou.headfirst.c2;

public class StatisticsDisplay implements Observer {
    Subject subject;

    public StatisticsDisplay(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public <Data> void update(Data data) {
        System.out.println("from statisticsdisplay:");
        System.out.println(data);
    }
}
