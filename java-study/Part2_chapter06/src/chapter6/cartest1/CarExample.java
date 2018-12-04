package chapter6.cartest1;

public class CarExample {
	public static void main(String[] args) {

		Car car1 = new Car();
		System.out.println(car1);		// print에 참조가 호출되면 이 참조의 
		System.out.println();			// toString이 호출된다.

		Car car2 = new Car("현대자동차");
		System.out.println(car2);
		System.out.println();

		Car car3 = new Car("현대자동차", "그랜져");
		System.out.println(car3);
		System.out.println();
		
		String str = "홍길동";		// String는 toString 가지고 있다.
		System.out.println(str);
	}
}