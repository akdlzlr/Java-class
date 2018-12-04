package edu.iot.leo.interfaceWeapon;

import edu.iot.common.util.Random;

public class AttackEx {
	public static void main(String[] args) {

		Robot robot = new Robot(100);
		Robot robot2 = new Robot(100);
		Weapon[] weapon = { new Gun(), new Sword(), new Missile() };

		for (int i = 0; i < 6; i++) {
			robot.Attack((weapon[Random.rand(0, weapon.length)]),robot2);
		}
		
		robot2.repair(20);
		Building building = new Building(100);
		
		robot2.Attack(new Missile(), building );
		robot2.Attack(new Missile(), building );
		robot2.Attack(new Missile(), building );
		robot2.Attack(new Missile(), building );
		robot2.Attack(new Missile(), building );
		building.repair(100);
		
		}
}