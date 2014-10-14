package de.morphyum.rpgcommander.objects;

public class Equipment extends Item {
private int dexBonus;
private int strBonus;
private int intBonus;
private int vitBonus;
	public Equipment(String name, int value, int dexBonus, int strBonus, int intBonus, int vitBonus) {
		super(name, value);
		this.dexBonus = dexBonus;
		this.strBonus = strBonus;
		this.intBonus = intBonus;
		this.vitBonus = vitBonus;
	}
	public int getDexBonus() {
		return dexBonus;
	}
	public void setDexBonus(int dexBonus) {
		this.dexBonus = dexBonus;
	}
	public int getStrBonus() {
		return strBonus;
	}
	public void setStrBonus(int strBonus) {
		this.strBonus = strBonus;
	}
	public int getIntBonus() {
		return intBonus;
	}
	public void setIntBonus(int intBonus) {
		this.intBonus = intBonus;
	}
	public int getVitBonus() {
		return vitBonus;
	}
	public void setVitBonus(int vitBonus) {
		this.vitBonus = vitBonus;
	}

}
