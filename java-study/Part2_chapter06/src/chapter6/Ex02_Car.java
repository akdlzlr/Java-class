package chapter6;

public class Ex02_Car {
	public static void main(String[] args) {
		Class_Car myCar = new Class_Car();
		
		System.out.println("���� ȸ�� : "+myCar.company);
		System.out.println("�� : "+myCar.model);
		System.out.println("���� : "+myCar.color);
		System.out.println("�ְ�ӵ� : "+myCar.maxSpeed);
		System.out.println("����ӵ� : "+myCar.speed);
		
		myCar.speed = 150;
		System.out.println("�ٲ� �ӵ� : "+myCar.speed);
				
		Class_Car yourCar = new Class_Car();
		yourCar.company = "�����ڵ���";
		yourCar.model = "���׽ý�";
		System.out.println(yourCar.company);
		System.out.println(yourCar.model);
	}
}
