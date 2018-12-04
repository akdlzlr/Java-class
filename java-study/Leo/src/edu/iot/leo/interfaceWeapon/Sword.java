package edu.iot.leo.interfaceWeapon;

public class Sword implements Weapon {

	public int power() {
		int power = 10;
		return power;
	}
	
	@Override
	public void attack() {
		System.out.println("Ä®·Î °ø°Ý!!!!");
	}
}