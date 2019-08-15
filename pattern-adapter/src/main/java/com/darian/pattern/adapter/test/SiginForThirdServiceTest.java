package com.darian.pattern.adapter.test;

import com.darian.pattern.adapter.ResultMsg;
import com.darian.pattern.adapter.passport.SiginForThirdService;

import static com.darian.pattern.adapter.passport.SiginForThirdService.QQ_OPEN_ID;

/**
 * <br>
 * <br>Darian
 **/
public class SiginForThirdServiceTest {
    public static void main(String[] args) {
        SiginForThirdService service = new SiginForThirdService();
        // 不改变原来的代码，也能兼容新的需求
        // 还可以再加一层策略模式
        ResultMsg resultMsg = service.loginForQQ(QQ_OPEN_ID);
        System.out.println(resultMsg);
    }
}
