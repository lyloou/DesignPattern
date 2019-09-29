package com.lyloou.headfirst.c2.javaimpl;

import com.lyloou.headfirst.c2.Data;

public class WeatherStation {

    private static Data getData() {
        Data data = new Data();
        data.setHumidity("12.3");
        data.setPressure("123");
        data.setTemp("23 C");
        return data;
    }

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        new CurrentConditionsDisplay(weatherData);
        new ForecastDisplay(weatherData);
        Data data = getData();
        weatherData.setData(data);

        data.setTemp("12");
        weatherData.setData(data);
    }
}
