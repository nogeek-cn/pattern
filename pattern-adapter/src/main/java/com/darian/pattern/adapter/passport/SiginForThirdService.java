package com.darian.pattern.adapter.passport;

import com.darian.pattern.adapter.ResultMsg;

/**
 * 稳定的方法不去动，直接继承下来
 * <br>Darian
 **/
public class SiginForThirdService extends SiginService {

    public ResultMsg loginForQQ(String openId) {
        // 1. openId 是全局唯一的，我们可以把它当作一个用户名(加长)
        // 2. 密码默认为 QQ_EMPTY
        // 3. 注册（在原有的系统里边创建一个用户）
        // 4. 调用原来的登陆方法
        return this.loginForRegist(openId, null);
    }

    public ResultMsg logForWeChat(String openId) {
        return null;
    }

    public ResultMsg loginForToken(String token) {
        // 通过 token 拿到用户信息，然后再重新登陆一次
        return null;
    }

    public ResultMsg loginForTelephone(String telephone, String code) {
        //
        return null;
    }

    public ResultMsg loginForRegist(String userName, String password) {
        super.regist(userName, password);
        return super.login(userName, password);
    }
}
