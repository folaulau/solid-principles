package com.lovemesomecoding.solid.user;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImp implements UserService {
	
	/*
	 * This UserServiceImp focuses on logic that are related to User
	 */
	
	
	@Override
	public User updateEmail(String newEmail) {
		/**
		 * 1. look up if newEmail already exists in db<br>
		 * 2. change email to newEmail in db
		 */
		return null;
	}

}
