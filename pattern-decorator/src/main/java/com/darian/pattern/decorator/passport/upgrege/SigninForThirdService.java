package com.darian.pattern.decorator.passport.upgrege;

import com.darian.pattern.decorator.passport.old.SigninService;
import com.darian.pattern.decorator.passport.old.ResultMsg;

public interface SigninForThirdService extends SigninService {
    public ResultMsg loginForQQ(String openId);

    public ResultMsg logForWeChat(String openId);

    public ResultMsg loginForToken(String token);

    public ResultMsg loginForTelephone(String telephone, String code);

    public ResultMsg loginForRegist(String userName, String password);
}
