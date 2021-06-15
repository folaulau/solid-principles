package com.lovemesomecoding.solid.user;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AdminUserServiceImp implements AdminUserService {
	
	/*
	 * Focus only on data in AdminUser
	 */

	@Override
	public boolean addClient(AdminUser adminUser, User user) {
		log.info("addClient(..)");
		
		/**
		 * 1. validate adminUser and user that they exist.<br>
		 * 2. etc.
		 */

		adminUser.addClient(user);

		return true;
	}

}
