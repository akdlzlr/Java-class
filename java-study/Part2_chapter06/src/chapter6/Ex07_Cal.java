package chapter6;

public class Ex07_Cal {
//	int a = 10;		// class Ex07_Cal의 인스턴스 변수이다.
	static int a = 10;	// static이 되면 인스턴스와 무관하게 메소드영역에 생성됨
	public static void main(String[] args) {

		System.out.println(" a = "+a);	// 메소드 영역의 a를 불러올수 있다.
//		System.out.println(" a = "+this.a);
		
		double result1 = 10 * 10 * Ex07_CalClass.pi;// 따로 인스턴스를 만들지 않고 바로
		int result2 = Ex07_CalClass.plus(10, 5);	// 사용 할 수 있다.
		int result3 = Ex07_CalClass.minus(10, 5);	// 
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
	}
}
