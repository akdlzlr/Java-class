package chapter7;

public class Ex04_Supersonic extends Ex04_Airplane {
	
//	상수
	public static final int NORMAL = 1;
	public final static int SUPERSONIC = 2;

//	필드
	public int flyMode = NORMAL;

//	메서드
	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행을 합니다.");
		} else {
			super.fly(); // Airplane 객체(부모 인스턴스)의 fly() 메소드를 호출
		}
	}
}
