package com.jazzinjars.fundamentals.patterns.abstractfactory.orcs;

import com.jazzinjars.fundamentals.patterns.abstractfactory.Castle;

public class OrcCastle implements Castle {

    static final String DESCRIPTION = "This is the Orc Castle!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
