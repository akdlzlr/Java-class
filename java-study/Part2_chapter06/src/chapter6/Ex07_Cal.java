package chapter6;

public class Ex07_Cal {
//	int a = 10;		// class Ex07_Cal�� �ν��Ͻ� �����̴�.
	static int a = 10;	// static�� �Ǹ� �ν��Ͻ��� �����ϰ� �޼ҵ念���� ������
	public static void main(String[] args) {

		System.out.println(" a = "+a);	// �޼ҵ� ������ a�� �ҷ��ü� �ִ�.
//		System.out.println(" a = "+this.a);
		
		double result1 = 10 * 10 * Ex07_CalClass.pi;// ���� �ν��Ͻ��� ������ �ʰ� �ٷ�
		int result2 = Ex07_CalClass.plus(10, 5);	// ��� �� �� �ִ�.
		int result3 = Ex07_CalClass.minus(10, 5);	// 
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
	}
}
