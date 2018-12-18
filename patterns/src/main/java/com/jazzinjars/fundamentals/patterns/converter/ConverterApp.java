package com.jazzinjars.fundamentals.patterns.converter;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public class ConverterApp {

    public static void main(String[] args) {
	Converter<UserDto, User> userConverter = new UserConverter();

	UserDto userDto = new UserDto("John", "Snow", true, "john.snow@stark.com");
	User user = userConverter.convertFromDto(userDto);
	System.out.println("Entity converted from DTO: " + user);

	ArrayList<User> users = Lists.newArrayList(new User("Arya", "Stark", false, "1234"),
			new User("Sansa", "Stark", true, "4321"), new User("Cersei", "Lannister", true, "3412"));
	System.out.println("Domain entities: ");
	users.forEach(System.out::println);

	System.out.println("DTO entities converted from domain: ");
	List<UserDto> dtoEntities = userConverter.createFromEntities(users);
	dtoEntities.forEach(System.out::println);
    }
}
