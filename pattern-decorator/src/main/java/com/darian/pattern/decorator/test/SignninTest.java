package com.darian.pattern.decorator.test;


import com.darian.pattern.decorator.passport.old.SigninServiceImpl;
import com.darian.pattern.decorator.passport.upgrege.SigninForThirdService;
import com.darian.pattern.decorator.passport.upgrege.SigninForThirdServiceImpl;

/**
 * <br>
 * <br>Darian
 **/
public class SignninTest {
    public static void main(String[] args) {
        // 原来的功能依旧对外开放，依旧保留
        // 新的功能同样的也可以使用
        SigninForThirdService signinForThirdService = new SigninForThirdServiceImpl(new SigninServiceImpl());
    }
}
