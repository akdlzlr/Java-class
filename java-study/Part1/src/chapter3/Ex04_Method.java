package chapter3;

public class Ex04_Method {

	static int add(int num1, int num2) {
		int sum;
		sum=num1+num2;
		return sum;
		//return 'a';  �ڵ� ��ȯ���� ���� x
	}
	
	
	public static void main(String args[]) {
		int result;
		result = add(3,4);
		// return;   �Ʒ��� ����� ���� �� �� ��� ����
		System.out.println("sum = "+result);
	}
}