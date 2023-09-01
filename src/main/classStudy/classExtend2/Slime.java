package main.classStudy.classExtend2;

public class Slime {
	protected double hp = 50;
	protected int attack = 8;
	protected double defense = 0.2;

	public void attack (Slime enemy) {
		enemy.hp -= this.attack * (1 - enemy.defense);
	}
}
