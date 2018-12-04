package chapter2;

public class From {
	public static void main(String[] args) {
		int num1 =123456780;
		int num2 =123456780;
		
		//float num3=num2; 은 정보왜곡이 생긴다.
		double num3 = num2;
		num2= (int) num3;
		System.out.println(num2);
		int result = num1-num2;
		System.out.println(result);
	}
}
