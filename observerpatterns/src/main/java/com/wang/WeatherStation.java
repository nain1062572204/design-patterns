package com.wang;

import com.wang.boards.CurrentConditionsDisplay;
import com.wang.dao.impl.WeatherData;

/**
 * @author 王念
 * @create 2019-11-03 23:30
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 60, 50);
        weatherData.setMeasurements(22, 23, 22);
        //currentConditionsDisplay.cancelRegister(weatherData);
        weatherData.setMeasurements(21, 32, 234);

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
}
