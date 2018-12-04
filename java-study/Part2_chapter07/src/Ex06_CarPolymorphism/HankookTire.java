package Ex06_CarPolymorphism;

public class HankookTire extends Tire{
	
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulatedRoation;
		if(accumulatedRoation<maxRotation) {
			System.out.println(location+" �ѱ� Ÿ�̾� ���� : "+(maxRotation-accumulatedRoation)+"ȸ");
		return true;
		}else {
			System.out.println("***"+location+" �ѱ� Ÿ�̾� ��ũ***");
			return false;
		}
	}	
}
