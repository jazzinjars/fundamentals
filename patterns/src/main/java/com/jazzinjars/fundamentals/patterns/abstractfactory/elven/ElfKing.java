package com.jazzinjars.fundamentals.patterns.abstractfactory.elven;

import com.jazzinjars.fundamentals.patterns.abstractfactory.King;

public class ElfKing implements King {

    static final String DESCRIPTION = "This is the Elven King!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
