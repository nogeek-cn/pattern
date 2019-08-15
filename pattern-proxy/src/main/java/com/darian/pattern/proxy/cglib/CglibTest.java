package com.darian.pattern.proxy.cglib;

/**
 * <br>
 * <br>Darian
 **/
public class CglibTest {
    public static void main(String[] args) throws Exception {
        ZhangSan zhangSan = (ZhangSan) new CGLIBMeiPo().getInstence(ZhangSan.class);
        zhangSan.findLove();
        System.out.println("----------------------------");
        System.out.println(zhangSan.getClass());
    }
}
