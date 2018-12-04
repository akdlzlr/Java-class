package Ex01_Interface;

public class RemoteControl2 {
	public static void main(String[] args) {
//		메서드가 한개이고 메서드가 한 줄일때 자주 쓰이는 기법이다.
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("전원을 켭니다.");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("전원을 끕니다.");
				
			}
			
			@Override
			public void setVolume(int volume) {
				System.out.println("소리를 조절 합니다.");
			}
		};
			
		rc.turnOn();
		rc.setVolume(0);
		rc.turnOff();
	}
}