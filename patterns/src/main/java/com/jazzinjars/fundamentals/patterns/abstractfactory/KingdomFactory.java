package com.jazzinjars.fundamentals.patterns.abstractfactory;

public interface KingdomFactory {

    Castle createCastle();
    Army createArmy();
    King createKing();
}
