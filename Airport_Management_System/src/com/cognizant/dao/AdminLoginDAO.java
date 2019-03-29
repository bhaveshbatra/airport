package com.cognizant.dao;

import com.cognizant.entity.Admin;

public interface AdminLoginDAO {
	
	public boolean doLogin(Admin admin);
	boolean addAdmin(Admin admin);
	public Admin addUser(String id, String password);

}
