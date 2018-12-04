package chapter6;

public class Ex02_Car {
	public static void main(String[] args) {
		Class_Car myCar = new Class_Car();
		
		System.out.println("제작 회사 : "+myCar.company);
		System.out.println("모델 : "+myCar.model);
		System.out.println("색깔 : "+myCar.color);
		System.out.println("최고속도 : "+myCar.maxSpeed);
		System.out.println("현재속도 : "+myCar.speed);
		
		myCar.speed = 150;
		System.out.println("바뀐 속도 : "+myCar.speed);
				
		Class_Car yourCar = new Class_Car();
		yourCar.company = "현대자동차";
		yourCar.model = "제네시스";
		System.out.println(yourCar.company);
		System.out.println(yourCar.model);
	}
}
