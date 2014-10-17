package de.morphyum.rpgcommander.objects.factories;

import java.util.ArrayList;

import de.morphyum.rpgcommander.declarations.monstertypes.MonsterType;
import de.morphyum.rpgcommander.objects.Monster;
import de.morphyum.rpgcommander.declarations.monstertypes.Blob;

public final class MonsterFactory {

	private MonsterFactory() {

	}

	public static Monster monsterForLevel(int level, int type) {

		switch (type) {
		case MonsterType.BLOB: {
			Blob blob = new Blob();
			return new Monster(blob.name(), blob.hitPoints() * level, blob.manaPoints() * level, blob.attack() * level, blob.defence() * level, blob.dodge() * level,
					blob.critical() * level, blob.hitValue() * level, level, blob.xpBonus() * level, blob.lootLevel() * level);
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
		int doubleCount = 2;
		for (int i = 0; i < group.length; i++) {
			for (int j = i + 1; j < group.length; j++) {
				if (group[i].getName().equals(group[j].getName())) {
					group[j].setName(group[j].getName() + doubleCount);
					doubleCount++;
				}
			}
		}
		return group;
	}
}
