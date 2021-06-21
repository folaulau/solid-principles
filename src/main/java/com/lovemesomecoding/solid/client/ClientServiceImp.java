package com.lovemesomecoding.solid.client;

import org.springframework.stereotype.Service;

import com.lovemesomecoding.solid.user.User;

@Service
public class ClientServiceImp implements ClientService {

	@Override
	public boolean bookAppointment(Client client, User user) {
		/**
		 * 1. schedule appointment on calendar of user.<br>
		 * 2. send email to user as a reminder<br>
		 * 3. charge client appointment fee<br>
		 */
		return false;
	}

}
