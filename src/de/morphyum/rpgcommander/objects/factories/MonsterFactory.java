package de.morphyum.rpgcommander.objects.factories;

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
			return new Monster(blob.name(), blob.hitPoints()*level, blob.manaPoints()*level, blob.attack()*level,blob.defence()*level, blob.dodge()*level, blob.critical()*level, blob.hitValue()*level, level, blob.xpBonus()*level, blob.lootLevel()*level);
		}
		default: {

		}
		}
		return null;
	}
}
