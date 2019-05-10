package com.xych.observer.jdkobserver;

import java.util.Observable;

import com.xych.observer.model.Weather;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 气象站
 * @Author XYCH
 * @CreateDate 2019年5月10日下午5:24:34
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class WeatherStation extends Observable {
    private Weather weather;

    public void publish() {
        setChanged();
        notifyObservers(weather);
    }
}
