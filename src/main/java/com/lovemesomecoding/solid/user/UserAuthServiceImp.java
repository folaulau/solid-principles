package com.lovemesomecoding.solid.user;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserAuthServiceImp implements UserAuthService {
	/*
	 * User authentication only
	 */
	@Override
	public User signUp(User user) {
		log.info("signUp(..)");
		return null;
	}

	@Override
	public User login(String email, String password) {
		log.info("login(..)");
		return null;
	}

}
