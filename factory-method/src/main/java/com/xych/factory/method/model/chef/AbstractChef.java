package com.xych.factory.method.model.chef;

import lombok.Data;

@Data
public abstract class AbstractChef implements Chef {
    protected String name;
}
