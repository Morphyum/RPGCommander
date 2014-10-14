package de.morphyum.rpgcommander.objects;

public class Armor extends Equipment {
	private int defenceValue;

	public Armor(String name, int value, int dexBonus, int strBonus, int intBonus, int vitBonus, int defenceValue) {
		super(name, value, dexBonus, strBonus, intBonus, vitBonus);
		this.setDefenceValue(defenceValue);
	}

	public int getDefenceValue() {
		return defenceValue;
	}

	public void setDefenceValue(int defenceValue) {
		this.defenceValue = defenceValue;
	}

}
