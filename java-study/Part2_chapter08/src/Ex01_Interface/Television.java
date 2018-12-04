package Ex01_Interface;

public class Television implements RemoteControl {
	private int volume;
//	추상 메서드를 구현함
	@Override				// 구현 상속, 추상 메서드 상속 등이라고 한다.
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("현재 TV 소리크기 : "+this.volume);
	}
}
