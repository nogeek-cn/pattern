package com.darian.pattern_23._27_SRP.darian;


public class DAOImp {
	//进行数据操作
	public void save(String username,String upassword) {
		System.out.println("将" + username + "保存到了数据库");
		System.out.println("将" + upassword + "保存到了数据库");
	}
}

