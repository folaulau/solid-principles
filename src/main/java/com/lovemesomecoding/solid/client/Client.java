package com.lovemesomecoding.solid.client;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(value = Include.NON_NULL)
public class Client implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String email;
	private String password;

	/**
	 * private User user;<br>
	 * 1. schedule appointment on calendar of user.<br>
	 * 2. send email to user as a reminder<br>
	 * 3. charge client appointment fee<br>
	 * 
	 * Note: instead of doing this logic here(bad idea). we moved it to the ClientService
	 * interface
	 */

}
