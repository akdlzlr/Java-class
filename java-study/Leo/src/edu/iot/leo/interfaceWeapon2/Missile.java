package edu.iot.leo.interfaceWeapon2;


public class Missile implements Weapon {
	int power;
	
	public Missile(int power) {
		this.power = power;
	}

	@Override
	public void attack(Unit target) {
		System.out.println("�̻��� ����");
		target.damage(power);
	}
}
