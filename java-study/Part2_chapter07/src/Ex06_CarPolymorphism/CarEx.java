package Ex06_CarPolymorphism;

public class CarEx {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		for(int i = 1; i <= 5; i++) {
			int problemLocation = myCar.run();
			
//			switch(problemLocation) {
//			case 1:
//				System.out.println("앞왼쪽 한국 타이어로 교체");
//				myCar.frontLeftTire = new HankookTire("앞왼쪽",15);	// 다형성의 특징! 예제 중 제일 중요!
//				break;
//			case 2:
//				System.out.println("앞오른쪽 금호 타이어로 교체");
//				myCar.frontRightTire = new KumhoTire("앞오른쪽", 14);
//				break;
//			case 3:
//				System.out.println("뒤왼쪽 한국 타이어로 교체");
//				myCar.backLeftTire = new HankookTire("뒤왼쪽", 18);
//				break;
//			case 4:
//				System.out.println("뒤오른쪽 금호 타이어로 교체");
//				myCar.backRightTire = new KumhoTire("뒤오른쪽", 15);
//				break;
//			
			if(problemLocation != 0) {
//				System.out.println(myCar.tires[problemLocation-1].location+
//																	"한국타이어로 교체");
//				myCar.tires[problemLocation-1] = new HankookTire(
//										myCar.tires[problemLocation-1].location,15);
			myCar.changeTire(problemLocation, 
					new HankookTire(problemLocation+"타이어",20));
			
			}
		System.out.println("--------------------------------------");
		}
	}
}