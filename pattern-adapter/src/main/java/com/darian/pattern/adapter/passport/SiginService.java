package com.darian.pattern.adapter.passport;

import com.darian.pattern.adapter.Member;
import com.darian.pattern.adapter.ResultMsg;

/**
 * <br>
 * <br>Darian
 **/
public class SiginService {

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
