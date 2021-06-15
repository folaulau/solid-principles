package com.lovemesomecoding.solid.user;

public interface AdminUserAuthService {

	AdminUser signUp(AdminUser adminUser);
	
	AdminUser login(String email, String password);
}
