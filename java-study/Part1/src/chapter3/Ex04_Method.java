package chapter3;

public class Ex04_Method {

	static int add(int num1, int num2) {
		int sum;
		sum=num1+num2;
		return sum;
		//return 'a';  자동 변환으로 에러 x
	}
	
	
	public static void main(String args[]) {
		int result;
		result = add(3,4);
		// return;   아래가 절대로 도달 할 수 없어서 에러
		System.out.println("sum = "+result);
	}
}