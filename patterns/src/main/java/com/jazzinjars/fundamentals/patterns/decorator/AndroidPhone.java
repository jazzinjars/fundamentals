package com.jazzinjars.fundamentals.patterns.decorator;

public class AndroidPhone extends PhoneDecorator {

    public AndroidPhone(Phone phone) {
	super(phone);
    }

    @Override
    public void printModel() {
	super.printModel();
	System.out.println("Adding Features of Android");
    }
}
