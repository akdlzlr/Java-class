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
			System.out.println("가한 데미지 : "+weapon.power());
			unit.damege(weapon.power());
		}
	}

	@Override
	public void damege(int loss) {
		hp-=loss;
		if(hp<=0) {
			System.out.println("공격 대상이 파괴 되었습니다.");
			System.out.println();
			hp=0;
		}else {
			System.out.println("건물의 남은 hp : "+hp);
			System.out.println();
		}
	}
	
	public void repair(int hp) {
		System.out.println("건물은 수리가 불가능합니다.");
	}
}

