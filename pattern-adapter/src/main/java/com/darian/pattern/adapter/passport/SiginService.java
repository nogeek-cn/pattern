package com.darian.pattern.adapter.passport;

import com.darian.pattern.adapter.Member;
import com.darian.pattern.adapter.ResultMsg;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <br>
 * <br>Darian
 **/
@Deprecated
public class SiginService {

    static Map<String, String> map = new ConcurrentHashMap<>();

    public static String ADMIN_PASSWORD = "admin";
    public static String ADMIN_USENAME = "admin";

    static {
        map.put(ADMIN_USENAME, ADMIN_PASSWORD);
    }

    /***
     * 注册方法
     * @param userName
     * @param password
     * @return
     */
    public ResultMsg regist(String userName, String password) {
        if (null == map.put(userName, password)) {
            return new ResultMsg("200", "注册成功",
                    Member.builder().userName(userName).password(password).build());
        }
        return new ResultMsg("500", "注册失败", null);
    }

    /***
     * 登陆方法
     * @param userName
     * @param password
     * @return
     */
    public ResultMsg login(String userName, String password) {
        if (password.equals(map.get(userName))) {
            return new ResultMsg("200", "登陆成功",
                    Member.builder().userName(userName).password(password).build());
        }
        return new ResultMsg("500", "登陆失败", null);
    }
}
