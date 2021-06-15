package com.lovemesomecoding.solid.user;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AdminUserAuthServiceImp implements AdminUserAuthService {
	
	/*
	 * Focus on AdminUser authentication
	 */

	@Override
	public AdminUser signUp(AdminUser adminUser) {
		log.info("signUp({})",adminUser.toString());
		return null;
	}

	@Override
	public AdminUser login(String email, String password) {
		log.info("signUp(email={}, password={})",email, password);
		return null;
	}

}
