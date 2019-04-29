package com.xych.abstractfactory.factory;

import com.xych.abstractfactory.model.dough.Dough;
import com.xych.abstractfactory.model.dough.IDough;
import com.xych.abstractfactory.model.ornament.DmfOrnament;
import com.xych.abstractfactory.model.ornament.IOrnament;
import com.xych.abstractfactory.model.seasoning.ISeasoning;
import com.xych.abstractfactory.model.seasoning.SugarSeasoning;
import com.xych.abstractfactory.model.shape.IShape;
import com.xych.abstractfactory.model.shape.Shape;
import com.xych.abstractfactory.model.toast.IToast;
import com.xych.abstractfactory.model.toast.Toast;

/**
 * Lanboo的制作方式
 * @Author XYCH
 * @CreateDate 2019年4月29日上午11:30:25
 * @Since: JDK1.8
 */
public class LanbooBreadMakingFactory implements BreadMakingFactory {
    public IDough createDough() {
        return new Dough(300, 20);
    }

    public ISeasoning createSeasoning() {
        return new SugarSeasoning("红糖(brown sugar)", 80);
    }

    public IShape createShape() {
        return new Shape("毛毛虫面包(Caterpillar bread)");
    }

    public IOrnament createOrnament() {
        return new DmfOrnament();
    }

    public IToast toast() {
        return new Toast(220D, 25);
    }
}
