package com.darian.pattern.factory.simple;

import com.darian.pattern.factory.MengNiu;
import com.darian.pattern.factory.Milk;
import com.darian.pattern.factory.TeLunSu;
import com.darian.pattern.factory.YiLi;

/**
 * <br>小作坊的工厂模式
 * <br>Darian
 **/
public class SimpleFactory {

    public Milk getMilk(String name) {
        if ("TeLunSu".equals(name)) {
            return new TeLunSu();
        } else if ("YiLi".equals(name)) {
            return new YiLi();
        } else if ("MengNiu".equals(name)) {
            return new MengNiu();
        }
        System.out.println("不能生产您所需的产品");
        return null;
    }
}
