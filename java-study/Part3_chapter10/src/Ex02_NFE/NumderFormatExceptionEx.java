package Ex02_NFE;

public class NumderFormatExceptionEx {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);		//NumberFormatException 발생!
//		예외명은 보통 길다. = 잘못된 부분이 설명되어 있다.
		
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + " = "+result);
	}
}
