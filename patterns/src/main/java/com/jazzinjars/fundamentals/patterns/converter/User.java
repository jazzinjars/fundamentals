package com.jazzinjars.fundamentals.patterns.converter;

import lombok.Data;

@Data
public class User {

	private String firstName;
	private String lastName;
	private boolean isActive;
	private String userId;

	public User(String firstName, String lastName, boolean isActive, String userId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.isActive = isActive;
		this.userId = userId;
	}
}
