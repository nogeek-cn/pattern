package com.darian.pattern.factory.AbstarctFactory;

import com.darian.pattern.factory.Milk;
import com.darian.pattern.factory.SanLu;
import com.darian.pattern.factory.facotry.MengNiuFacotry;
import com.darian.pattern.factory.facotry.TeLunSuFacotry;
import com.darian.pattern.factory.facotry.YiLiFactory;

/**
 * <br>
 * <br>Darian
 **/
public class MilkFactory extends AbstractFactory {

    @Override
    public Milk getMengNiu() {
        return new MengNiuFacotry().getMilk();
    }

    @Override
    public Milk getYiLi() {
        return new YiLiFactory().getMilk();
    }

    @Override
    public Milk getTeLunSu() {
        return new TeLunSuFacotry().getMilk();
    }

    @Override
    public Milk getSanLu() {
        return new SanLu();
    }
}
