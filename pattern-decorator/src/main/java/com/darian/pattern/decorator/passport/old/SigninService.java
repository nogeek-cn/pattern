package com.darian.pattern.decorator.passport.old;

@Deprecated // 过时
public interface SigninService {

    ResultMsg regist(String userName, String password);


    ResultMsg login(String userName, String password);
}
