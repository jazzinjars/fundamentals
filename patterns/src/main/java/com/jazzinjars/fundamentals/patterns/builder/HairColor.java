package com.jazzinjars.fundamentals.patterns.builder;

public enum HairColor {
    WHITE, BLOND, RED, BROWN, BLACK;

    @Override
    public String toString() {
	return name().toLowerCase();
    }
}
