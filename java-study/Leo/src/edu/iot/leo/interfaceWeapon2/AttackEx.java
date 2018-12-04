package edu.iot.leo.interfaceWeapon2;

import edu.iot.common.util.Random;

public class AttackEx {
	public static void main(String[] args) {
		Weapon[] weapons = { new Missile(30), new Sword(10), new Gun(20) };

		Robot robot1 = new Robot("°Ç´ã", 100);
		Unit robot2 = new Robot("ÀÚÄí", 100);

		// 5È¸ °ø°Ý
		for (int i = 0; i < 5; i++) {
			int select = Random.rand(0, weapons.length);
			Weapon w = weapons[select];
			robot1.attack(w, robot2);
			if (robot2.getHp() < 0) {
				System.out.println(robot2.getName() + "ÆÄ±«µÊ");
				break;
			}
			robot2.printStatus();
		}

		Unit building = new Building("»ç·ÉºÎ", 60);
		// 5È¸ °ø°Ý
		for (int i = 0; i < 5; i++) {
			int select = Random.rand(0, weapons.length);
			Weapon w = weapons[select];
			robot1.attack(w, building);
			if (building.getHp() < 0) {
				System.out.println(building.getName() + "ÆÄ±«µÊ");
				break;
			}
			building.printStatus();
		}

	}

}