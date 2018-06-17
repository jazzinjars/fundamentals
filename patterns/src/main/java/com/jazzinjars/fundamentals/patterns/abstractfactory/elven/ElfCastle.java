package com.jazzinjars.fundamentals.patterns.abstractfactory.elven;

import com.jazzinjars.fundamentals.patterns.abstractfactory.Castle;

public class ElfCastle implements Castle {

    static final String DESCRIPTION = "This is the Elven Castle!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
