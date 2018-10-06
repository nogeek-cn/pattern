package com.darian.pattern.decorator.passport.old;

/**
 * <br>
 * <br>Darian
 **/
public class SigninServiceImpl implements SigninService {
    /***
     * 注册方法
     * @param userName
     * @param password
     * @return
     */
    public ResultMsg regist(String userName, String password) {
        return new ResultMsg("200", "注册成功", new Member());
    }

    /***
     * 登陆方法
     * @param userName
     * @param password
     * @return
     */
    public ResultMsg login(String userName, String password) {
        return null;
    }
}
