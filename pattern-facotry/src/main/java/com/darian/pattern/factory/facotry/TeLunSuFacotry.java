package com.darian.pattern.factory.facotry;

import com.darian.pattern.factory.Milk;
import com.darian.pattern.factory.TeLunSu;

/**
 * <br>
 * <br>Darian
 **/
public class TeLunSuFacotry implements Facotry {
    @Override
    public Milk getMilk() {
        return new TeLunSu();
    }
}
