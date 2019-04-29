package com.xych.abstractfactory.model.seasoning;

import lombok.Data;

/**
 * 加糖
 * @Author XYCH
 * @CreateDate 2019年4月29日上午10:51:53
 * @Since: JDK1.8
 */
@Data
public class SugarSeasoning implements ISeasoning {
    private String name;
    private Integer weight;

    public SugarSeasoning() {
        super();
    }

    public SugarSeasoning(Integer weight) {
        super();
        this.name = "白糖(white sugar)";
        this.weight = weight;
    }

    public SugarSeasoning(String name, Integer weight) {
        super();
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "SugarSeasoning by " + name + weight + "g";
    }
}
