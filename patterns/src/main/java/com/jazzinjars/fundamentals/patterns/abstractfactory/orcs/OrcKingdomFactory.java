package com.jazzinjars.fundamentals.patterns.abstractfactory.orcs;

import com.jazzinjars.fundamentals.patterns.abstractfactory.Army;
import com.jazzinjars.fundamentals.patterns.abstractfactory.Castle;
import com.jazzinjars.fundamentals.patterns.abstractfactory.King;
import com.jazzinjars.fundamentals.patterns.abstractfactory.KingdomFactory;

public class OrcKingdomFactory implements KingdomFactory {

    @Override
    public Castle createCastle() {
        return new OrcCastle();
    }

    @Override
    public Army createArmy() {
        return new OrcArmy();
    }

    @Override
    public King createKing() {
        return new OrcKing();
    }
}
