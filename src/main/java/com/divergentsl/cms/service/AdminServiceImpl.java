package com.divergentsl.cms.service;

import com.divergentsl.cms.dao.AdminDao;
import com.divergentsl.cms.dao.AdminDaoImpl;
import com.divergentsl.cms.entity.Admin;

public class AdminServiceImpl implements AdminService {

	public boolean login(String username, String password) {
		
		AdminDao adminDao = new AdminDaoImpl();
		
		Admin admin = adminDao.login(username);
		if (admin == null) return false;
		return username.equals(admin.getUsername()) && password.equals(admin.getPassword());
	}

}
