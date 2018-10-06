package com.darian.pattern.adapter.test;

import com.darian.pattern.adapter.passport.SiginForThirdService;

/**
 * <br>
 * <br>Darian
 **/
public class SiginForThirdServiceTest {
    public static void main(String[] args) {
        SiginForThirdService service = new SiginForThirdService();
        // 不改变原来的代码，也能兼容新的需求
        // 还可以再加一层策略模式
        service.loginForQQ("dsfasdfadfasf");
    }
}
