package de.morphyum.rpgcommander.output;

import de.morphyum.rpgcommander.objects.Hero;

public interface Output {	
	void showText(String text);
	void enterTown(Hero[] heroes);
}
