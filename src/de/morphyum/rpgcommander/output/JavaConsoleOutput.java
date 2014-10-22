package de.morphyum.rpgcommander.output;

import de.morphyum.rpgcommander.objects.Hero;

public class JavaConsoleOutput implements Output {

	@Override
	public void showText(String text) {
		if (text != null) {
			System.out.println(text);
		}
	}

	@Override
	public void enterTown(Hero[] heroes) {
		System.out.println("");
		System.out.println("");
		System.out.println("Heroes entered Town:");
		System.out.println("");
		for (int i = 0; i < heroes.length; i++) {
			System.out.printf(heroes[i].toString()+"\n\n");
		}
	}

}
