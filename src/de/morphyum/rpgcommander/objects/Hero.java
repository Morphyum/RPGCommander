package de.morphyum.rpgcommander.objects;

public class Hero extends Chara {
	private int strength;
	private int dexterity;
	private int vitality;
	private int intelligence;
	private Head headSlot;
	private Boot bootSlot;
	private Chest chestSlot;
	private Weapon weaponSlot;
	private Item[] inventory;
	private int experience;
	private int money;

	public Hero(String name, int hitPoints, int manaPoints, int attack, int defence, int dodge, int critical, int hitValue, int level, int strength,
			int dexterity, int vitality, int intelligence, Head headSlot, Boot bootSlot, Chest chestSlot, Weapon weaponSlot, Item[] inventory, int experience,
			int money) {
		super(name, hitPoints, manaPoints, attack, defence, dodge, critical, hitValue, level);
		this.setStrength(strength);
		this.setDexterity(dexterity);
		this.setVitality(vitality);
		this.setIntelligence(intelligence);
		this.setHeadSlot(headSlot);
		this.setBootSlot(bootSlot);
		this.setChestSlot(chestSlot);
		this.setWeaponSlot(weaponSlot);
		this.setInventory(inventory);
		this.setExperience(experience);
		this.setMoney(money);

	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getDexterity() {
		return dexterity;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	public int getVitality() {
		return vitality;
	}

	public void setVitality(int vitality) {
		this.vitality = vitality;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public Head getHeadSlot() {
		return headSlot;
	}

	public void setHeadSlot(Head headSlot) {
		this.headSlot = headSlot;
	}

	public Boot getBootSlot() {
		return bootSlot;
	}

	public void setBootSlot(Boot bootSlot) {
		this.bootSlot = bootSlot;
	}

	public Chest getChestSlot() {
		return chestSlot;
	}

	public void setChestSlot(Chest chestSlot) {
		this.chestSlot = chestSlot;
	}

	public Weapon getWeaponSlot() {
		return weaponSlot;
	}

	public void setWeaponSlot(Weapon weaponSlot) {
		this.weaponSlot = weaponSlot;
	}

	public Item[] getInventory() {
		return inventory;
	}

	public void setInventory(Item[] inventory) {
		this.inventory = inventory;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}
