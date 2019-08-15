package com.darian.pattern_23._27_SRP.darian;

public class Validator {
    //进行数据校验
    public boolean validate(String username, String upassword) {
        if (username == null || "".equals(username.trim())) {
            System.out.println("用户名不能为空");
            return false;
        }
        if (upassword == null || "".equals(upassword.trim())) {
            System.out.println("密码不能为空");
            return false;
        }
        return true;
    }
}
