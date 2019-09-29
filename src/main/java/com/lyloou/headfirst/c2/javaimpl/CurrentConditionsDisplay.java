package com.lyloou.headfirst.c2.javaimpl;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer {
    private Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData wd = (WeatherData) o;
            System.out.println("current conditions get new data from weather data:");
            System.out.println(wd.getData());
        }
    }
}
