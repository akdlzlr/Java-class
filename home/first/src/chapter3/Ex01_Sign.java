package chapter3;

public class Ex01_Sign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		
		System.out.println("result1="+result1);
		System.out.println("result2="+result2);
		
		short s = 100;
		// short result3=-s 는 컴파일 에러 발생 -s가 연산되어 int 타입
		int result3 = -s;
		System.out.println("result3="+result3);
	}
}