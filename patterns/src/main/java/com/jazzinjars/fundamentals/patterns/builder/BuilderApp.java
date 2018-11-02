package com.jazzinjars.fundamentals.patterns.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuilderApp {

    private static final Logger LOGGER = LoggerFactory.getLogger(BuilderApp.class);

    public static void main(String[] args) {
	HeroLombok mage = HeroLombok.builder().name("Dumbledor").profession(Profession.MAGE)
			.hairColor(HairColor.BLACK)
			.weapon(Weapon.DAGGER).build();
	LOGGER.info(mage.toString());

	HeroLombok warrior = HeroLombok.builder().name("Legolas").profession(Profession.WARRIOR).hairColor(HairColor.BLOND)
			.hairType(HairType.LONG_CURLY).armor(Armor.CHAIN_MAIL).weapon(Weapon.BOW)
			.build();
	LOGGER.info(warrior.toString());

	Hero thief =
		new Hero.Builder(Profession.THIEF, "Desmond").withHairType(HairType.BALD)
			.withWeapon(Weapon.BOW).build();
	LOGGER.info(thief.toString());
    }
}
