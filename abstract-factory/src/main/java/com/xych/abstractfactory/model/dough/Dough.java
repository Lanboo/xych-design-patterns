package com.xych.abstractfactory.model.dough;

import lombok.Data;

@Data
public class Dough implements IDough {
    private String flourName;
    private Integer flourWeight;
    private String waterName;
    private Integer waterWeight;

    public Dough() {
    }

    public Dough(Integer flourWeight, Integer waterWeight) {
        this.flourName = "小麦(wheat)";
        this.flourWeight = flourWeight;
        this.waterName = "自来水(top-water)";
        this.waterWeight = waterWeight;
    }

    public Dough(String flourName, Integer flourWeight, String waterName, Integer waterWeight) {
        this.flourName = flourName;
        this.flourWeight = flourWeight;
        this.waterName = waterName;
        this.waterWeight = waterWeight;
    }

    @Override
    public String toString() {
        return "Dough by " + flourName + flourWeight + "g and " + waterName + waterWeight + "g.";
    }
}
