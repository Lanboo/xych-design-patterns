package com.xych.observer.jdkobserver;

import java.util.Observable;
import java.util.Observer;

import com.xych.observer.model.Weather;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BaseDisplay implements Observer, Display {
    private Weather weather;

    @Override
    public void display() {
        log.info("{} by {}", weather, this);
    }

    @Override
    public void update(Observable o, Object arg) {
        this.weather = (Weather) arg;
        display();
    }
}
