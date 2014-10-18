package de.morphyum.rpgcommander.output;

public class JavaConsoleOutput implements Output {

	@Override
	public void showText(String text) {
		if (text != null) {
			System.out.println(text);
		}
	}

}
