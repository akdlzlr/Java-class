package edu.iot.leo.interfaceWeapon3;

public class Missile implements Weapon {
	
	public int power() {
		int power = 30;
		return power;
	}
	@Override
	public void attack() {
		System.out.println("미사일로 공격!@");
	}
}