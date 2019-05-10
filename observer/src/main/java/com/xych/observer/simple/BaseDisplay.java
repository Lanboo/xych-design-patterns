package com.xych.observer.simple;

import com.xych.observer.model.Weather;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BaseDisplay implements Observer, Display {
    private Weather weather;

    @Override
    public void update(Observable obs, Object arg) {
        this.weather = (Weather) arg;
        display();
    }

    @Override
    public void display() {
        log.info("{} by {}", weather, this);
    }
}
