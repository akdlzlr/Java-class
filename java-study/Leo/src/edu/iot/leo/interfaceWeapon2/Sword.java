package edu.iot.leo.interfaceWeapon2;

public class Sword implements Weapon {
	int power;
	
	public Sword(int power) {
		this.power = power;
	}
	
	@Override
	public void attack(Unit target) {
		System.out.println("Ä®À» ÈÖµÎ¸¨´Ï´Ù.");
		target.damage(power);
	}

}