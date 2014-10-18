package de.morphyum.rpgcommander.events;

import java.util.Random;

import de.morphyum.rpgcommander.objects.Chara;
import de.morphyum.rpgcommander.objects.Hero;
import de.morphyum.rpgcommander.objects.Monster;
import de.morphyum.rpgcommander.output.Output;

public class Battle {
	private Hero[] goodGuys;
	private Monster[] badGuys;
	private int turn;
	private Output output;
	
	public Battle(Hero[] goodGuys, Monster[] badguys, Output output) {
		this.setGoodGuys(goodGuys);
		this.setBadGuys(badguys);
		this.setTurn(0);
		this.output = output;
	}

	public void startBattle() {
		output.showText("Battle Start");
		while ((countAlive(this.badGuys) > 0) && (countAlive(this.goodGuys) > 0)) {
			nextTurn();
		}
		endBattle();
	}

	private void nextTurn() {
		this.turn++;
		output.showText("Turn " + turn + ":");
		output.showText("");
		output.showText("Heroes Turn");
		for (int i = 0; i < this.goodGuys.length; i++) {
			if ((this.goodGuys[i].getHitPoints() > 0) && (countAlive(this.badGuys) > 0)) {
				output.showText(this.goodGuys[i].getName() + " attacks");
				output.showText(this.goodGuys[i].attack(randomAliveChar(this.badGuys)));
			} else if (countAlive(this.goodGuys) <= 0) {
				break;
			}
		}

		if (countAlive(this.badGuys) > 0) {
			output.showText("");
			output.showText("Monster Turn");
			for (int i = 0; i < this.badGuys.length; i++) {
				if ((this.badGuys[i].getHitPoints() > 0) && (countAlive(this.goodGuys) > 0)) {
					output.showText(this.badGuys[i].getName() + " attacks");
					output.showText(this.badGuys[i].attack(randomAliveChar(this.goodGuys)));
				} else if (countAlive(this.badGuys) <= 0) {
					break;
				}
			}
		}
		output.showText("");
		output.showText("");
	}

	private void endBattle() {
		if (countAlive(this.badGuys) > 0) {
			output.showText("Heroes Defeated");
		} else {
			output.showText("Heroes Won");
			awardXP();
		}
	}

	private void awardXP(){
		for (int i = 0; i < goodGuys.length; i++) {
			int totalXp = 0;
			for (int j = 0; j < badGuys.length; j++) {
				totalXp += badGuys[j].getXpBonus();
			}
			this.goodGuys[i].setExperience(this.goodGuys[i].getExperience() + totalXp);
			output.showText("Heroes earned "+totalXp+ " XP");
			output.showText(this.goodGuys[i].checkLevelUp());
		}
	}
	
	private Chara randomAliveChar(Chara[] group) {
		Random rn = new Random();
		int random;
		do {
			random = rn.nextInt(group.length);
		} while (group[random].getHitPoints() <= 0);
		return group[random];
	}

	private int countAlive(Chara[] group) {
		int groupAlive = 0;
		for (int i = 0; i < group.length; i++) {
			if (group[i].getHitPoints() > 0) {
				groupAlive++;
			}
		}
		return groupAlive;
	}

	public Hero[] getGoodGuys() {
		return goodGuys;
	}

	public void setGoodGuys(Hero[] goodGuys) {
		this.goodGuys = goodGuys;
	}

	public Monster[] getBadGuys() {
		return badGuys;
	}

	public void setBadGuys(Monster[] badGuys) {
		this.badGuys = badGuys;
	}

	public int getTurn() {
		return turn;
	}

	public void setTurn(int turn) {
		this.turn = turn;
	}
}
