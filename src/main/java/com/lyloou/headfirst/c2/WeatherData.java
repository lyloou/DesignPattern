package com.lyloou.headfirst.c2;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    List<Observer> list = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public <Data> void notifyObserver(Data data) {
        for (Observer observer : list) {
            observer.update(data);
        }
    }

    public void measurementsChanged(Data data) {
        notifyObserver(data);
    }
}
