package com.xych.abstractfactory.model.seasoning;

import lombok.Data;

/**
 * 奶油 Cream
 * @Author XYCH
 * @CreateDate 2019年4月29日上午11:24:43
 * @Since: JDK1.8
 */
@Data
public class CreamSeasoning implements ISeasoning {
    private Integer weight;

    public CreamSeasoning() {
        super();
    }

    public CreamSeasoning(Integer weight) {
        super();
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "CreamSeasoning by " + weight + "g";
    }
}
