package com.darian.pattern.factory.AbstarctFactory;

import com.darian.pattern.factory.Milk;

/**
 * 抽象工厂是用户的主入口
 * 在 Spring 种应用得最为广泛的一种设计模式
 * 易于拓展
 * <br>Darian
 **/
public abstract class AbstractFactory {

    // 公共的逻辑
    // 方便于统一的管理

    /**
     * 获得一个 MengNiu
     **/
    public abstract Milk getMengNiu();

    /**
     * 获得一个 YiLi
     **/
    public abstract Milk getYiLi();

    /**
     * 获得一个 TeLunSu
     **/
    public abstract Milk getTeLunSu();

    public abstract Milk getSanLu();
}
