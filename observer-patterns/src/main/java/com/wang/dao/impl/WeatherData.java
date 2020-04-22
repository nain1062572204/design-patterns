package com.wang.dao.impl;

import java.util.Observable;

/**
 * @author 王念
 * @create 2019-11-03 23:15
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;


    /**
     * 当气象站更新调用此方法
     */
    private void measurementsChanged() {
        setChanged();
        //通知观察者更新
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
