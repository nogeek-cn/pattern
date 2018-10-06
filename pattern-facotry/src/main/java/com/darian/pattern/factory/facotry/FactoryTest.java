package com.darian.pattern.factory.facotry;

import com.darian.pattern.factory.YiLi;

/**
 * <br>
 * <br>Darian
 **/
public class FactoryTest {
    public static void main(String[] args) {
        // 货比三家，
        // 不知道谁好谁坏
        // 配置，可能会配置错
        MengNiuFacotry mengNiuFacotry = new MengNiuFacotry();
        System.out.println(mengNiuFacotry.getMilk());
        YiLiFactory yiLiFactory = new YiLiFactory();
        System.out.println(yiLiFactory.getMilk());
        TeLunSuFacotry teLunSuFacotry = new TeLunSuFacotry();
        System.out.println(teLunSuFacotry.getMilk());
    }
}
