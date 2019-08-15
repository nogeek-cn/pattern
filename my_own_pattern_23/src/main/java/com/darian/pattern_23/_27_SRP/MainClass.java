package com.darian.pattern_23._27_SRP;


public class MainClass {
    public static void main(String[] args) {
        SaveToDB std = new SaveToDB();
        //接受客户端的输入
        std.shuru();
        if (std.validate()) {
            std.getConnection();
            std.save();
        }
    }
}
