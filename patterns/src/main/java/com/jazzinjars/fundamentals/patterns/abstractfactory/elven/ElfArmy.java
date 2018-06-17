package com.jazzinjars.fundamentals.patterns.abstractfactory.elven;

import com.jazzinjars.fundamentals.patterns.abstractfactory.Army;

public class ElfArmy implements Army {

    static final String DESCRIPTION = "This is the Elven Army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
