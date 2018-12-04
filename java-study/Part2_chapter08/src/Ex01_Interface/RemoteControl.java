package Ex01_Interface;

public interface RemoteControl {		// interface가 기본 형식이다
//	상수
	int MAX_VOLUME = 10;	// final static 생략 가능
	int MIN_VOLUME = 0;		// 기본적으로 public이 디폴트 값이다
		
//	추상 메서드 - 메서드 선언부만 작성
	void turnOn();			// abstract 생략 가능
	void turnOff();			// 기본적으로 public이 디폴트 값이다
	void setVolume(int volume);

	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리");
		}else {
			System.out.println("무음 해제");
		}
	}
	
	static void changeBattery() {
		System.out.println("건전지를 교환");
	}
}