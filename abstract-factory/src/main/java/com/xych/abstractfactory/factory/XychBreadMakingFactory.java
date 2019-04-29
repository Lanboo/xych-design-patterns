package com.xych.abstractfactory.factory;

import com.xych.abstractfactory.model.dough.Dough;
import com.xych.abstractfactory.model.dough.IDough;
import com.xych.abstractfactory.model.ornament.IOrnament;
import com.xych.abstractfactory.model.ornament.RaisinsOrnament;
import com.xych.abstractfactory.model.seasoning.ISeasoning;
import com.xych.abstractfactory.model.seasoning.SugarSeasoning;
import com.xych.abstractfactory.model.shape.IShape;
import com.xych.abstractfactory.model.shape.Shape;
import com.xych.abstractfactory.model.toast.IToast;
import com.xych.abstractfactory.model.toast.Toast;

/**
 * XYCH的制作方式
 * @Author XYCH
 * @CreateDate 2019年4月29日上午11:29:30
 * @Since: JDK1.8
 */
public class XychBreadMakingFactory implements BreadMakingFactory {
    public IDough createDough() {
        return new Dough(500, 50);
    }

    public ISeasoning createSeasoning() {
        return new SugarSeasoning(100);
    }

    public IShape createShape() {
        return new Shape("五角星(five-pointed star)");
    }

    public IOrnament createOrnament() {
        return new RaisinsOrnament();
    }

    public IToast toast() {
        return new Toast(200D, 30);
    }
}
