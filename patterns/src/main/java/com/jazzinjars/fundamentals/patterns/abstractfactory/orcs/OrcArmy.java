package com.jazzinjars.fundamentals.patterns.abstractfactory.orcs;

import com.jazzinjars.fundamentals.patterns.abstractfactory.Army;

public class OrcArmy implements Army {

    static final String DESCRIPTION = "This is the Orc Army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}