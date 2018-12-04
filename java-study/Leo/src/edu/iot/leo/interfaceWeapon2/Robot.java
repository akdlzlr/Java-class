package edu.iot.leo.interfaceWeapon2;

public class Robot extends Unit{

	public Robot(String name, int hp) {
		super(name, hp);
	}

	public void attack(Weapon weapon, Unit unit) {
		weapon.attack(unit);		
	}

	@Override
	public void damage(int loss) {
		hp -= loss;	
	}
}