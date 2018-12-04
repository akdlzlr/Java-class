package Ex02_CarInterface;

public class CarEx {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.tires[0] = new KumhoTIre();
		myCar.tires[1] = new KumhoTIre();
		
		myCar.run();
	}
}