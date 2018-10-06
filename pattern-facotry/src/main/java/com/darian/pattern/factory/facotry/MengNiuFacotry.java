package com.darian.pattern.factory.facotry;

import com.darian.pattern.factory.MengNiu;
import com.darian.pattern.factory.Milk;

/**
 * <br>
 * <br>Darian
 **/
public class MengNiuFacotry implements Facotry {
    @Override
    public Milk getMilk() {
        return new MengNiu();
    }
}
