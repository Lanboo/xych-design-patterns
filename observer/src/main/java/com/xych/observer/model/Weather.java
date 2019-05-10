package com.xych.observer.model;

import lombok.Data;

@Data
public class Weather {
    // 温度
    private Double temperature;
    // 湿度
    private Double humidity;
    // 压力
    private Double pressure;
}
