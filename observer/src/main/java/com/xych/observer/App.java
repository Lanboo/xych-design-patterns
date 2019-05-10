package com.xych.observer;

import com.xych.observer.model.Weather;
import com.xych.observer.simple.BaseDisplay;
import com.xych.observer.simple.Observable;

public class App {
    public static void main(String[] args) {
        simpleObserver();
    }

    private static void simpleObserver() {
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
