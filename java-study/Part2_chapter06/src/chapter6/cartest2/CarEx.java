package chapter6.cartest2;

public class CarEx {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5);
//		myCar.gas = 5;			인스턴스에 있는 값을 강제로 바꿈, 필드를 외부에서 바꾸는건 좋지않다.
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("연료가 충분함");
		}else {
			System.out.println("연료를 주입하시오.");
		}
	}
}