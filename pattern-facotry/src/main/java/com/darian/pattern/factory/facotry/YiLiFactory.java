package com.darian.pattern.factory.facotry;

import com.darian.pattern.factory.Milk;
import com.darian.pattern.factory.YiLi;

/**
 * <br>
 * <br>Darian
 **/
public class YiLiFactory implements Facotry {
    @Override
    public Milk getMilk() {
        return new YiLi();
    }
}
