package com.lovemesomecoding.solid.user;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserNotificationServiceImp implements UserNotificationService {

	@Override
	public boolean sendEmail(User user) {
		/**
		 * loop through and send email
		 */
		return false;
	}

}
