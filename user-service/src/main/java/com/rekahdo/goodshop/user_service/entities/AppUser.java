package com.rekahdo.goodshop.user_service.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class AppUser {

	private String username;
	private String password;

	public AppUser(String username, String password) {
		this.username = username;
		this.password = password;
	}
}
