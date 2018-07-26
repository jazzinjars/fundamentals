package com.jazzinjars.fundamentals.patterns.converter;

import lombok.Data;

@Data
public class UserDto {

	private String firstName;
	private String lastName;
	private boolean isActive;
	private String email;

	public UserDto(String firstName, String lastName, boolean isActive, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.isActive = isActive;
		this.email = email;
	}
}
