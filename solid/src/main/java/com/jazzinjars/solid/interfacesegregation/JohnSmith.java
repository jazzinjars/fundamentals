package com.jazzinjars.solid.interfacesegregation;

public class JohnSmith implements SwimmingAthlete {

	@Override
	public void compete() {
		System.out.println("John Smith started competing");
	}

	@Override
	public void swim() {
		System.out.println("John Smith started swimming");
	}
}
