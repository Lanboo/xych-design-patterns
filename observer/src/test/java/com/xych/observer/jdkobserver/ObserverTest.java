package com.xych.observer.jdkobserver;

import com.xych.observer.model.Weather;

public class ObserverTest {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.addObserver(new BaseDisplay());
        weatherStation.addObserver(new BaseDisplay());
        weatherStation.addObserver(new BaseDisplay());
        weatherStation.setWeather(getWeather());
        weatherStation.publish();
    }

    private static Weather getWeather() {
        Weather weather = new Weather();
        weather.setTemperature(22.5);
        weather.setHumidity(75.5);
        weather.setPressure(1000.5);
        return weather;
    }
}
