package com.wang.boards;

import com.wang.dao.DisplayElement;
import com.wang.dao.impl.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * @author 王念
 * @create 2019-11-03 23:25
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        //订阅
        observable.addObserver(this);
    }

    public void display() {
        System.out.println("Current conditions:" + temperature + "°" + "  " + "humidity" + humidity + "%");
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    public void cancelRegister(Observable subject) {
        subject.deleteObserver(this);
    }

    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
