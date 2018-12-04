package chapter7;

public class Ex01_DmbCellPhone extends Ex01_CellPhone {	// extends 부모클래스명
//	필드
	int channel;
//	생성자
	Ex01_DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
//	메서드
	void turnOnDmb() {
		System.out.println("채널  "+ channel+"번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 "+channel+"번으로 바꿈");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송을 멈춤");
	}
}
