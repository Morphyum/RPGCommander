package de.morphyum.rpgcommander.objects;

import java.util.Random;

public class Chara extends Entity {
	private int hitPoints;
	private int manaPoints;
	private int attack;
	private int defence;
	private int dodge;
	private int critical;
	private int hitValue;
	private int level;


	public Chara(String name, int hitPoints, int manaPoints, int attack, int defence, int dodge, int critical, int hitValue, int level) {
		super(name);
		this.hitPoints = hitPoints;
		this.manaPoints = manaPoints;
		this.attack = attack;
		this.defence = defence;
		this.dodge = dodge;
		this.critical = critical;
		this.hitValue = hitValue;
		this.hitPoints = hitPoints;
		this.level = level;
	}

	public String attack(Chara enemy) {
		float atkModifier = 1;
		float dodgeModifier = 1;
		float critModifier = 1;
		Random random = new Random();
		String output = null;
		atkModifier = random.nextFloat() * (2f);
		dodgeModifier = random.nextFloat() * (2f);
		if (this.hitValue * atkModifier > enemy.getDodge() * dodgeModifier) {
			critModifier = random.nextFloat() * (2f);
			if ((this.critical * critModifier) > (enemy.getDodge()*4)) {
				output= "CRIT! ";
				output+=enemy.gotHit(this.attack * 2);
			} else {
				output=enemy.gotHit(this.attack);
			}
		} else {
			output= "Missed";
		}
		return output;
	}

	public String gotHit(int damage) {
		int lost = damage - defence;
		String output;
		if (lost > 0) {
			this.hitPoints -= lost;
			if (this.hitPoints <= 0) {
				output= this.getName() + " died";
			} else {
				output= this.getName() + " lost " + lost + " HitPoints he has " + this.getHitPoints() + " now";
			}
		} else {
			output= this.getName() + " absorbed all damage";
		}
		return output;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getManaPoints() {
		return manaPoints;
	}

	public void setManaPoints(int manaPoints) {
		this.manaPoints = manaPoints;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefence() {
		return defence;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}

	public int getDodge() {
		return dodge;
	}

	public void setDodge(int dodge) {
		this.dodge = dodge;
	}

	public int getCritical() {
		return critical;
	}

	public void setCritical(int critical) {
		this.critical = critical;
	}

	public int getHitValue() {
		return hitValue;
	}

	public void setHitValue(int hitValue) {
		this.hitValue = hitValue;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}
