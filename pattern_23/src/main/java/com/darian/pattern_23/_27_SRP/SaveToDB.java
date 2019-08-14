package com.darian.pattern_23._27_SRP;

import java.util.Scanner;


public class SaveToDB {
	private String username;
	private String upassword;


	//获得客户端输入
	public void shuru() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户名");
		username = scanner.nextLine();
		System.out.println("请输入密码");
		upassword = scanner.nextLine();
	}

	//进行数据校验
	public boolean validate() {
		if(username == null || "".equals(username.trim())) {
			System.out.println("用户名不能为空");
			return false;
		}
		if(upassword == null || "".equals(upassword.trim())) {
			System.out.println("密码不能为空");
			return false;
		}
		return true;
	}

	//连接数据库
	public void getConnection() {
		System.out.println("获得数据库连接");
	}

	//进行数据操作
	public void save() {
		System.out.println("将" + username + "保存到了数据库");
		System.out.println("将" + upassword + "保存到了数据库");
	}
}
