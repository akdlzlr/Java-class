package chapter6.cartest1;

public class CarExample {
	public static void main(String[] args) {

		Car car1 = new Car();
		System.out.println(car1);		// print�� ������ ȣ��Ǹ� �� ������ 
		System.out.println();			// toString�� ȣ��ȴ�.

		Car car2 = new Car("�����ڵ���");
		System.out.println(car2);
		System.out.println();

		Car car3 = new Car("�����ڵ���", "�׷���");
		System.out.println(car3);
		System.out.println();
		
		String str = "ȫ�浿";		// String�� toString ������ �ִ�.
		System.out.println(str);
	}
}