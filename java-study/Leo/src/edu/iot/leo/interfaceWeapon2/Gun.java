package edu.iot.leo.interfaceWeapon2;

public class Gun implements Weapon {
	int power;
	
	public Gun(int power) {
		this.power = power;
	}

	@Override
	public void attack(Unit target) {
		System.out.println("ÃÑÀ» ½õ´Ï´Ù.");
		target.damage(power);
	}
}
