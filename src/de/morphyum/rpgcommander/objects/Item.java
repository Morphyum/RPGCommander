package de.morphyum.rpgcommander.objects;

public class Item extends Entity {
	private int value;
	
	public Item(String name, int value) {
		super(name);
		this.setValue(value);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
