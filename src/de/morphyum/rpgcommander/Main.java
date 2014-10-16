package de.morphyum.rpgcommander;

import de.morphyum.rpgcommander.declarations.monstertypes.MonsterType;
import de.morphyum.rpgcommander.events.Battle;
import de.morphyum.rpgcommander.objects.Boot;
import de.morphyum.rpgcommander.objects.Chest;
import de.morphyum.rpgcommander.objects.Head;
import de.morphyum.rpgcommander.objects.Hero;
import de.morphyum.rpgcommander.objects.Item;
import de.morphyum.rpgcommander.objects.Monster;
import de.morphyum.rpgcommander.objects.Weapon;
import de.morphyum.rpgcommander.objects.factories.MonsterFactory;

//0.2
public class Main {
	public static void main(String[] args) throws Exception {
		
		String name= "Morphyum";
		int level = 1;
		int strength = 5;
		int dexterity= 5;
		int vitality= 5;
		int intelligence = 5;
		Head headSlot = new Head("No Helm", 0, 0, 0, 0, 0, 0);
		Boot bootSlot= new Boot("No Boots", 0, 0, 0, 0, 0, 0);
		Chest chestSlot= new Chest("No Armor", 0, 0, 0, 0, 0, 0);
		Weapon weaponSlot= new Weapon("No Weapon", 0, 0, 0, 0, 0, 0);
		Item[] inventory= null;
		int experience=0;
		int money=0;
		Hero morphyum = new Hero(name, level, strength, dexterity, vitality, intelligence, headSlot, bootSlot,
				chestSlot, weaponSlot, inventory, experience, money);
		
		Hero[] heroes = new Hero[1];
		heroes[0] = morphyum;
		
		Monster[] monsters = new Monster[2];
		monsters[0] = MonsterFactory.monsterForLevel(2, MonsterType.BLOB);
		monsters[1] = MonsterFactory.monsterForLevel(2, MonsterType.BLOB);
		
		Battle testBattle = new Battle(heroes, monsters);
		testBattle.startBattle();
	}
}
