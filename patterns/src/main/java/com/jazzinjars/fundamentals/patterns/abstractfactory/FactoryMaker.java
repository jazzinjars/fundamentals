package com.jazzinjars.fundamentals.patterns.abstractfactory;

import com.jazzinjars.fundamentals.patterns.abstractfactory.elven.ElfKingdomFactory;
import com.jazzinjars.fundamentals.patterns.abstractfactory.orcs.OrcKingdomFactory;

public class FactoryMaker {

    public enum KingdomType {
        ELF, ORC
    }

    public static KingdomFactory makeFactory(KingdomType kingdomType) {
        switch (kingdomType) {
            case ELF:
                return new ElfKingdomFactory();
            case ORC:
                return new OrcKingdomFactory();
            default:
                throw new IllegalArgumentException("Kingdom not supported.");
        }
    }
}
