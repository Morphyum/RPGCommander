package de.morphyum.rpgcommander.declarations.monstertypes;

public class MonsterType {
	public static final int TYPE_COUNT = MonsterType.class.getDeclaredFields().length - 1;
	public static final int BLOB = 0;
	public static final int LIZZARD = 1;
	
	private MonsterType() {

	}

}
