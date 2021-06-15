package com.lovemesomecoding.solid.user;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(value = Include.NON_NULL)
public class AdminUser extends User implements Serializable {

	private static final long serialVersionUID = 1L;

	// supervisor, team lead, admin
	private String type;

	private Set<User> clients;
	
	public void addClient(User client) {
		if(this.clients==null) {
			this.clients = new HashSet<>();
		}
		this.clients.add(client);
	}

}
