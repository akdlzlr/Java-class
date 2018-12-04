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
			System.out.println(location+"타이어 수명 : "+(maxRotation-accumulatedRoation)+"회");
			return true;
		}else {
			System.out.println("***"+location+"타이어 펑크 ***");
			return false;
		}
	}
}