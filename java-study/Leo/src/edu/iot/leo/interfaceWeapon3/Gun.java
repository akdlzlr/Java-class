package edu.iot.leo.interfaceWeapon3;

public class Gun implements Weapon {

	int power;
	
	public Gun(int power) {
		this.power = power;
	}
	
	@Override
	public void attack() {
		System.out.println("户具户具!! 帕帕帕帕!!");
	}
}