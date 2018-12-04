package chapter4;

public class Ex08_ForPrint {
	public static void main(String[] args) {
		int i=1;
		for(; i<=10;i++) {
			System.out.println(i);
		}
		System.out.println("현재 i 값 : "+i); //for문에 있는 i는 for문에서만 존재 = 지역변수
	 
		for(i=10;i>=1;i--) {
			System.out.println(i);
		}
	}
}