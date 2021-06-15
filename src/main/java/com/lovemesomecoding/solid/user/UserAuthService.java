package com.lovemesomecoding.solid.user;

public interface UserAuthService {

	User signUp(User user);
	
	User login(String email, String password);
	
}
