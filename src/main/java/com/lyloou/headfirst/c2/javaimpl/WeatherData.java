package com.lyloou.headfirst.c2.javaimpl;

import com.lyloou.headfirst.c2.Data;

import java.util.Observable;

public class WeatherData extends Observable {
    private Data data;

    public void setData(Data data) {
        this.data = data;
        measurementsChanged();
    }

    public Data getData() {
        return data;
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }
}
