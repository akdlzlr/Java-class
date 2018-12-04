package edu.iot.leo.interfaceWeapon2;

import edu.iot.common.util.Random;

public class AttackEx {
	public static void main(String[] args) {
		Weapon[] weapons = { new Missile(30), new Sword(10), new Gun(20) };

		Robot robot1 = new Robot("�Ǵ�", 100);
		Unit robot2 = new Robot("����", 100);

		// 5ȸ ����
		for (int i = 0; i < 5; i++) {
			int select = Random.rand(0, weapons.length);
			Weapon w = weapons[select];
			robot1.attack(w, robot2);
			if (robot2.getHp() < 0) {
				System.out.println(robot2.getName() + "�ı���");
				break;
			}
			robot2.printStatus();
		}

		Unit building = new Building("��ɺ�", 60);
		// 5ȸ ����
		for (int i = 0; i < 5; i++) {
			int select = Random.rand(0, weapons.length);
			Weapon w = weapons[select];
			robot1.attack(w, building);
			if (building.getHp() < 0) {
				System.out.println(building.getName() + "�ı���");
				break;
			}
			building.printStatus();
		}

	}

}