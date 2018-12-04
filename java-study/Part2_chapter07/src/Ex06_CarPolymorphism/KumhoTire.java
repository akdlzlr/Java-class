package Ex06_CarPolymorphism;

public class KumhoTire extends Tire {

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulatedRoation;
		if (accumulatedRoation < maxRotation) {
			System.out.println(location + "금호 타이어 수명 : " + (maxRotation - accumulatedRoation) + "회");
			return true;
		} else {
			System.out.println("***" + location + " 금호 타이어 펑크 ***");
			return false;
		}
	}
}