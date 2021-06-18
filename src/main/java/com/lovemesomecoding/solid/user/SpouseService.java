package com.lovemesomecoding.solid.user;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SpouseService implements UserService {

	@Override
	public User updateEmail(String newEmail) {
		/**
		 * 1. look up if newEmail already exists in db<br>
		 * 2. change email to newEmail in db<br>
		 * 3. send email to new email for verification<br>
		 * 4. send email to Primary user that spouse email was change
		 */
		return null;
	}

}
