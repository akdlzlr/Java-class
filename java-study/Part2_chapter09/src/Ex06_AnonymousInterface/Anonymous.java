package Ex06_AnonymousInterface;

public class Anonymous {
//	필드
	RemoteControl field = new RemoteControl(){
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
//		인터페이스 이므로 골격을 만들어 주는것은 필수이다.
	};
	
//	지역변수
	void method1() {
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("오디오를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("오디오를 끕니다.");
			}
		};
//		로컬 변수 사용
		localVar.turnOn();
	}
	
//	호출 시 정의
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}