package com.xych.observer.simple;

import com.xych.observer.model.Weather;

public class ObserverTest {
    public static void main(String[] args) {
        Observable obs = new Observable();
        obs.addObserver(new BaseDisplay());
        obs.addObserver(new BaseDisplay());
        obs.addObserver(new BaseDisplay());
        Weather weather = getWeather();
        obs.notifyObservers(weather);
    }

    private static Weather getWeather() {
        Weather weather = new Weather();
        weather.setTemperature(22.5);
        weather.setHumidity(75.5);
        weather.setPressure(1000.5);
        return weather;
    }
}
