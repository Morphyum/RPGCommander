package de.morphyum.rpgcommander;

import de.morphyum.rpgcommander.events.Battle;
import de.morphyum.rpgcommander.objects.Boot;
import de.morphyum.rpgcommander.objects.Chest;
import de.morphyum.rpgcommander.objects.Head;
import de.morphyum.rpgcommander.objects.Hero;
import de.morphyum.rpgcommander.objects.Item;
import de.morphyum.rpgcommander.objects.Monster;
import de.morphyum.rpgcommander.objects.Weapon;

public class Main {
	public static void main(String[] args) throws Exception {
		String name= "Morphyum";

		int manaPoints = 0;
		int defence = 2;
		int critical= 0;
		int hitValue = 10;
		int level = 1;
		int strength = 5;
		int dexterity= 5;
		int vitality= 5;
		int intelligence = 0;
		Head headSlot = new Head("No Helm", 0, 5, 5, 0, 5, 0);
		Boot bootSlot= new Boot("No Boots", 0, 5, 5, 0, 5, 0);
		Chest chestSlot= new Chest("No Armor", 0, 5, 5, 0, 5, 0);
		Weapon weaponSlot= new Weapon("No Weapon", 0, 5, 5, 0, 5, 2);
		Item[] inventory= null;
		int experience=0;
		int money=0;
		Hero morphyum = new Hero(name, manaPoints, defence, critical, hitValue, level, strength, dexterity, vitality, intelligence, headSlot, bootSlot,
				chestSlot, weaponSlot, inventory, experience, money);
		
		name= "Blob";
		int hitPoints= 50;
		manaPoints = 0;
		int attack = 4;
		defence = 5;
		int dodge = 5;
		critical= 0;
		hitValue = 10;
		level = 1;
		int xpBonus=0;
		int lootLevel=0;
		Monster blob = new Monster(name, hitPoints, manaPoints, attack, defence, dodge, critical, hitValue, level, xpBonus, lootLevel);
		
		name= "Blob2";
		hitPoints= 50;
		manaPoints = 0;
		attack = 4;
		defence = 5;
		dodge = 5;
		critical= 0;
		hitValue = 10;
		level = 1;
		xpBonus=0;
		lootLevel=0;
		Monster blob2 = new Monster(name, hitPoints, manaPoints, attack, defence, dodge, critical, hitValue, level, xpBonus, lootLevel);
		
		Hero[] heroes = new Hero[1];
		heroes[0] = morphyum;
		
		Monster[] monsters = new Monster[2];
		monsters[0] = blob;
		monsters[1] = blob2;
		
		Battle testBattle = new Battle(heroes, monsters);
		testBattle.startBattle();
	}
}
