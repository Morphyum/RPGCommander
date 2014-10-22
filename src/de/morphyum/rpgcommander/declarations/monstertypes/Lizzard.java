package de.morphyum.rpgcommander.declarations.monstertypes;

public class Lizzard implements MonsterTypeInterface{

	@Override
	public int hitPoints() {
		return 10;
	}

	@Override
	public int manaPoints() {
		return 0;
	}

	@Override
	public int attack() {
		return 5;
	}

	@Override
	public int defence() {
		return 5;
	}

	@Override
	public int dodge() {
		return 3;
	}

	@Override
	public int critical() {
		return 3;
	}

	@Override
	public int hitValue() {
		return 3;
	}

	@Override
	public int xpBonus() {
		return 20;
	}

	@Override
	public int lootLevel() {
		return 2;
	}

	@Override
	public String name() {
		return "Lizzard";
	}

}
