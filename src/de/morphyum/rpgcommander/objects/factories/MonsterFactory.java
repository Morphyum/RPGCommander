package de.morphyum.rpgcommander.objects.factories;

import java.util.ArrayList;
import java.util.Random;

import de.morphyum.rpgcommander.declarations.monstertypes.Blob;
import de.morphyum.rpgcommander.declarations.monstertypes.Lizzard;
import de.morphyum.rpgcommander.declarations.monstertypes.MonsterType;
import de.morphyum.rpgcommander.objects.Monster;

public final class MonsterFactory {

	private MonsterFactory() {

	}
	
	public static Monster randomMonsterForLevel(int level) {

		Random random = new Random();
		int type = random.nextInt(MonsterType.TYPE_COUNT);
		return monsterForLevel(level,type);
	}
	
	public static Monster monsterForLevel(int level, int type) {

		switch (type) {
		case MonsterType.BLOB: {
			Blob monster = new Blob();
			return new Monster(monster.name(), monster.hitPoints() * level, monster.manaPoints() * level, monster.attack() * level, monster.defence() * level, monster.dodge() * level,
					monster.critical() * level, monster.hitValue() * level, level, monster.xpBonus() * level, monster.lootLevel() * level);
		}
		case MonsterType.LIZZARD: {
			Lizzard monster = new Lizzard();
			return new Monster(monster.name(), monster.hitPoints() * level, monster.manaPoints() * level, monster.attack() * level, monster.defence() * level, monster.dodge() * level,
					monster.critical() * level, monster.hitValue() * level, level, monster.xpBonus() * level, monster.lootLevel() * level);
		}
		default: {
			
		}
		}
		return null;
	}

	public static Monster[] makeMonsterGroup(ArrayList<Monster> monsterList) {
		Monster[] group = new Monster[monsterList.size()];

		for (int i = 0; i < monsterList.size(); i++) {
			group[i] = monsterList.get(i);
		}

		return renameDouble(group);
	}

	private static Monster[] renameDouble(Monster[] group) {
		
		for (int i = 0; i < group.length; i++) {
			for (int j = i + 1; j < group.length; j++) {
				if (group[i].getName().equals(group[j].getName())) {
					int doubleCount = 1;
					for(int k = 0; k < j; k++){
						if(group[k].getName().contains(group[i].getName())){
							doubleCount++;
						}
					}
					group[j].setName(group[j].getName() + doubleCount);
				}
			}
		}
		return group;
	}
}
