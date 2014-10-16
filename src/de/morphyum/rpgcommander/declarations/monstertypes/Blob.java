package de.morphyum.rpgcommander.declarations.monstertypes;

public class Blob implements MonsterTypeInterface{

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
		return 1;
	}

	@Override
	public int defence() {
		return 1;
	}

	@Override
	public int dodge() {
		return 1;
	}

	@Override
	public int critical() {
		return 1;
	}

	@Override
	public int hitValue() {
		return 3;
	}

	@Override
	public int xpBonus() {
		return 1;
	}

	@Override
	public int lootLevel() {
		return 1;
	}

	@Override
	public String name() {
		return "Blob";
	}

}
