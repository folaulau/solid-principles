package com.lovemesomecoding.solid.user;

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
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String email;
	private String password;

}
