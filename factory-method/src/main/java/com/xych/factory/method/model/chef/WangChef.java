package com.xych.factory.method.model.chef;

/**
 * 王师傅
 * @author XYCH
 * @CreateDate 2019年4月28日下午9:48:53
 */
public class WangChef extends AbstractChef {
    public WangChef() {
        this.name = "Mr Wang";
    }

    @Override
    public String toString() {
        return this.name;
    }
}
