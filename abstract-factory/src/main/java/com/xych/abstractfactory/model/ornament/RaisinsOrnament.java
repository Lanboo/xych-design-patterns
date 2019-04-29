package com.xych.abstractfactory.model.ornament;

/**
 * 葡萄干(Raisins)
 * @Author XYCH
 * @CreateDate 2019年4月29日上午11:07:03
 * @Since: JDK1.8
 */
public class RaisinsOrnament extends Ornament {
    public RaisinsOrnament() {
        super("葡萄干(Raisins)");
    }

    public static void main(String[] args) {
        System.out.println(new RaisinsOrnament());
    }
}
