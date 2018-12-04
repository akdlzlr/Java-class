package Ex06_CarPolymorphism;

public class Tire {
	public int maxRotation;
	public int accumulatedRoation;
	public String location;
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accumulatedRoation;
		if(accumulatedRoation<maxRotation) {
			System.out.println(location+"Ÿ�̾� ���� : "+(maxRotation-accumulatedRoation)+"ȸ");
			return true;
		}else {
			System.out.println("***"+location+"Ÿ�̾� ��ũ ***");
			return false;
		}
	}
}