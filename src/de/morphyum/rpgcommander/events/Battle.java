package de.morphyum.rpgcommander.events;

import java.util.Random;

import de.morphyum.rpgcommander.objects.Chara;
import de.morphyum.rpgcommander.objects.Hero;
import de.morphyum.rpgcommander.objects.Monster;

public class Battle {
	private Hero[] goodGuys;
	private Monster[] badGuys;
	private int turn;

	public Battle(Hero[] goodGuys, Monster[] badguys) {
		this.setGoodGuys(goodGuys);
		this.setBadGuys(badguys);
		this.setTurn(0);
	}

	public void startBattle() {
		System.out.println("Battle Start");
		while ((countAlive(this.badGuys) > 0) && (countAlive(this.goodGuys) > 0)) {
			nextTurn();
		}
		endBattle();
	}

	private void nextTurn() {
		this.turn++;
		System.out.println("Turn " + turn + ":");
		System.out.println("");
		System.out.println("Heroes Turn");
		for (int i = 0; i < this.goodGuys.length; i++) {
			if ((this.goodGuys[i].getHitPoints() > 0) && (countAlive(this.badGuys) > 0)) {
				System.out.println(this.goodGuys[i].getName() + " attacks");
				this.goodGuys[i].attack(randomAliveChar(this.badGuys));
			} else if(countAlive(this.goodGuys) <= 0) {
				break;
			}
		}
		
		if (countAlive(this.badGuys) > 0) {
			System.out.println("");
			System.out.println("Monster Turn");
			for (int i = 0; i < this.badGuys.length; i++) {
				if ((this.badGuys[i].getHitPoints() > 0) && (countAlive(this.goodGuys) > 0)) {
					System.out.println(this.badGuys[i].getName() + " attacks");
					this.badGuys[i].attack(randomAliveChar(this.goodGuys));
				} else if(countAlive(this.badGuys) <= 0) {
					break;
				} 
			}
		} 
		System.out.println("");
		System.out.println("");
	}

	private void endBattle(){
		if (countAlive(this.badGuys) > 0) {
			System.out.println("Heroes Defeated");
		} else {
			System.out.println("Heroes Won");
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
