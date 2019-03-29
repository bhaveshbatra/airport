package com.cognizant.service;

import com.cognizant.entity.Admin;

public interface AdminLoginService {
	
	public boolean doLogin(Admin admin);
	boolean addAdmin(Admin admin);
	public boolean addUser(String id, String password);
	

}
