package com.jazzinjars.fundamentals.patterns.decorator;

public class PhoneDecorator implements Phone {

    public Phone phone; //Has a reference

    public PhoneDecorator(Phone phone) {
	    this.phone = phone;
    }

    @Override
    public void printModel() {
	    this.phone.printModel();
    }
}
