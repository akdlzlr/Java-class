package edu.iot.leo.interfaceWeapon3;

public class Robot implements Unit{
//	���� ü�� ����
	protected int hp;
	
//	���� ������
	public Robot(int hp) {
		super();
		this.hp = hp;
	}
//	���� ü�� getter,setter �޼��� 
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
//	------------------------------------------------------------------------
//	���� �� ����..
	public void Attack(Weapon weapon,Unit unit) {
		if(hp>=0) {
			weapon.attack();
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
			System.out.println("���� hp : "+hp);
			System.out.println();
		}
	}
	
	public void repair(int hp) {
		if(this.hp>0) {
			this.hp+=hp;
			System.out.println(hp+" ��ŭ ġ�� �� hp : "+this.hp);
		}else {
			System.out.println("�ı��Ǿ� ������ �Ұ����մϴ�.");
			System.out.println();
		}
	}
}