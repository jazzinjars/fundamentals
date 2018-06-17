package com.jazzinjars.fundamentals.patterns.abstractfactory.orcs;

import com.jazzinjars.fundamentals.patterns.abstractfactory.King;

public class OrcKing implements King {

    static final String DESCRIPTION = "This is the Orc King!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
