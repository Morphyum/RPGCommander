package de.morphyum.rpgcommander.objects;

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
	
	public void attack(Chara enemy){
		if(this.hitValue > enemy.getDodge()){
			enemy.gotHit(this.attack);
		}
	}
	
	public void gotHit(int damage){
		int lost = damage-defence;
		this.hitPoints -= lost;
		System.out.println(this.getName()+" lost " + lost + " HitPoints he has " + this.getHitPoints() + " now");
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
