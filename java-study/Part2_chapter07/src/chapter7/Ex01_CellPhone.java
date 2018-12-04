package chapter7;

public class Ex01_CellPhone {
//	필드
	protected String model;		// 상속시킬 필드는 protected로 설정하는 것이 좋다.
	protected String color;		// 자식 클래스가 접근하여 수정할 수 있다.
//	생성자
	
//	메소드
	void powerOn() {
		System.out.println("power on");
	}
	void powerOff() {
		System.out.println("power off");
	}
	void bell() {
		System.out.println("Ring ~");
	}
	void sendVoice(String messege){
		System.out.println("me : "+messege);
	}
	void receiveVoice(String messege) {
		System.out.println("you : "+messege);
	}
	void hangUp() {
		System.out.println("hangUp...");
	}
}
