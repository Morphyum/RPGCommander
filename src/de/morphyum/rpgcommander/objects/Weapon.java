package de.morphyum.rpgcommander.objects;

public class Weapon extends Equipment {
	private int attackValue;

	public Weapon(String name, int value, int dexBonus, int strBonus, int intBonus, int vitBonus, int attackValue) {
		super(name, value, dexBonus, strBonus, intBonus, vitBonus);
		this.setAttackValue(attackValue);
	}

	public int getAttackValue() {
		return attackValue;
	}

	public void setAttackValue(int attackValue) {
		this.attackValue = attackValue;
	}

}
