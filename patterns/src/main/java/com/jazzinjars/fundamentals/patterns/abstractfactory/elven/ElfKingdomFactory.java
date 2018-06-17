package com.jazzinjars.fundamentals.patterns.abstractfactory.elven;

import com.jazzinjars.fundamentals.patterns.abstractfactory.Army;
import com.jazzinjars.fundamentals.patterns.abstractfactory.Castle;
import com.jazzinjars.fundamentals.patterns.abstractfactory.King;
import com.jazzinjars.fundamentals.patterns.abstractfactory.KingdomFactory;

public class ElfKingdomFactory implements KingdomFactory {

    @Override
    public Castle createCastle() {
        return new ElfCastle();
    }

    @Override
    public Army createArmy() {
        return new ElfArmy();
    }

    @Override
    public King createKing() {
        return new ElfKing();
    }
}
