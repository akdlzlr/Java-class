package edu.iot.leo.interfaceWeapon3;

public class Building implements Unit{
	protected int hp;
	
	public Building (int hp) {
		super();
		this.hp = hp;
	}
	
	public void Attack(Weapon weapon,Unit unit) {
		if(hp>0) {
			weapon.attack();
			System.out.println("���� ������ : "+weapon.power());
			unit.damege(weapon.power());
		}
	}

	@Override
	public void damege(int loss) {
		hp-=loss;
		if(hp<=0) {
			System.out.println("���� ����� �ı� �Ǿ����ϴ�.");
			System.out.println();
			hp=0;
		}else {
			System.out.println("�ǹ��� ���� hp : "+hp);
			System.out.println();
		}
	}
	
	public void repair(int hp) {
		System.out.println("�ǹ��� ������ �Ұ����մϴ�.");
	}
}

