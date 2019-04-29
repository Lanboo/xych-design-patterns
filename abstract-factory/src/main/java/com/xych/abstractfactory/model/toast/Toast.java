package com.xych.abstractfactory.model.toast;

import lombok.Data;

@Data
public class Toast implements IToast {
    private Double temperature;
    private Integer time;

    public Toast() {
        super();
    }

    public Toast(Double temperature, Integer time) {
        super();
        this.temperature = temperature;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Toast [" + temperature + "℃, " + time + "min]";
    }
}
