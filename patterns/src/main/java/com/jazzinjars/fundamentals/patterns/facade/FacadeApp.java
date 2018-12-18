package com.jazzinjars.fundamentals.patterns.facade;

public class FacadeApp {

    public static void main(String[] args) {
	DwarvenGoldmineFacade facade = new DwarvenGoldmineFacade();
	facade.startNewDay();
	facade.digOutGold();
	facade.endDay();
    }
}
