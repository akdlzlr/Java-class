package Ex06_CarPolymorphism;

public class KumhoTire extends Tire {

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulatedRoation;
		if (accumulatedRoation < maxRotation) {
			System.out.println(location + "��ȣ Ÿ�̾� ���� : " + (maxRotation - accumulatedRoation) + "ȸ");
			return true;
		} else {
			System.out.println("***" + location + " ��ȣ Ÿ�̾� ��ũ ***");
			return false;
		}
	}
}