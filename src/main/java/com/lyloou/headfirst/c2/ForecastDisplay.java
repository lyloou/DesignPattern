package com.lyloou.headfirst.c2;

public class ForecastDisplay implements Observer {
    Subject subject;

    public ForecastDisplay(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public <Data> void update(Data data) {
        System.out.println("from forecastdisplay:");
        System.out.println(data);
    }
}
