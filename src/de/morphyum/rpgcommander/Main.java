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
		int hitPoints= 100;
		int manaPoints = 0;
		int attack = 10;
		int defence = 2;
		int dodge = 5;
		int critical= 0;
		int hitValue = 10;
		int level = 0;
		int strength = 0;
		int dexterity= 0;
		int vitality= 0;
		int intelligence = 0;
		Head headSlot = null;
		Boot bootSlot= null;
		Chest chestSlot= null;
		Weapon weaponSlot= null;
		Item[] inventory= null;
		int experience=0;
		int money=0;
		Hero morphyum = new Hero(name, hitPoints, manaPoints, attack, defence, dodge, critical, hitValue, level, strength, dexterity, vitality, intelligence, headSlot, bootSlot,
				chestSlot, weaponSlot, inventory, experience, money);
		
		name= "Blob";
		hitPoints= 50;
		manaPoints = 0;
		attack = 4;
		defence = 5;
		dodge = 5;
		critical= 0;
		hitValue = 10;
		level = 0;
		int xpBonus=0;
		int lootLevel=0;
		Monster blob = new Monster(name, hitPoints, manaPoints, attack, defence, dodge, critical, hitValue, level, xpBonus, lootLevel);
		
		Hero[] heroes = new Hero[1];
		heroes[0] = morphyum;
		
		Monster[] monsters = new Monster[1];
		monsters[0] = blob;
		
		Battle testBattle = new Battle(heroes, monsters);
		testBattle.startBattle();
	}
}
