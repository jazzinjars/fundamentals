package com.jazzinjars.fundamentals.patterns.abstractfactory;

public class AbstractFactoryApp {

    private KingdomFactory kingdomFactory;

    public static void main(String[] ars) throws Exception {

        AbstractFactoryApp app = new AbstractFactoryApp();

        app.createKingdom(FactoryMaker.makeFactory(FactoryMaker.KingdomType.ELF));
        //app.getArmy().getDescription();
    }

    public AbstractFactoryApp() {
    }

    public void createKingdom(KingdomFactory factory) {
        this.kingdomFactory = factory;
    }

}
