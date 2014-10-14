package de.morphyum.rpgcommander.objects;

public class Monster extends Chara {
private int xpBonus;
private int lootLevel;
	public Monster(String name, int hitPoints, int manaPoints, int attack, int defence, int dodge, int critical, int hitValue, int level, int xpBonus, int lootLevel) {
		super(name, hitPoints, manaPoints, attack, defence, dodge, critical, hitValue, level);
		this.xpBonus = xpBonus;
		this.lootLevel = lootLevel;
	}
	
	public int getXpBonus() {
		return xpBonus;
	}
	public void setXpBonus(int xpBonus) {
		this.xpBonus = xpBonus;
	}
	public int getLootLevel() {
		return lootLevel;
	}
	public void setLootLevel(int lootLevel) {
		this.lootLevel = lootLevel;
	}

}
