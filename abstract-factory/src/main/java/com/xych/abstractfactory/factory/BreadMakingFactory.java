package com.xych.abstractfactory.factory;

import com.xych.abstractfactory.model.dough.IDough;
import com.xych.abstractfactory.model.ornament.IOrnament;
import com.xych.abstractfactory.model.seasoning.ISeasoning;
import com.xych.abstractfactory.model.shape.IShape;
import com.xych.abstractfactory.model.toast.IToast;

/**
 * 面包抽象工厂
 * @Author XYCH
 * @CreateDate 2019年4月29日上午11:22:56
 * @Since: JDK1.8
 */
public interface BreadMakingFactory {
    IDough createDough();

    ISeasoning createSeasoning();

    IShape createShape();

    IOrnament createOrnament();

    IToast toast();
}
