package com.lovemesomecoding.solid.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AdminUserServiceImp implements AdminUserService {

	/*
	 * Focus only on data in AdminUser
	 */

	@Autowired
	private UserNotificationService userNotificationService;

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

	@Override
	public boolean notifyAllUsersOfDayOff() {
		List<User> users = new ArrayList<>();
		users.add(new User());
		users.add(new AdminUser());

		/**
		 * call the UserNotificationService.sendEmail(...) to send the notification
		 */

		for (User user : users) {
			// User and AdminUser
			userNotificationService.sendEmail(user);
		}
		
		return false;
	}

}
