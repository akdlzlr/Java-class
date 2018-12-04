package Ex01_Interface;

public class RemoteControlEx {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
		
		rc.turnOn();
		rc.setMute(true);
		rc.setMute(false);
		rc.setVolume(5);
		rc.setVolume(12);
		rc.turnOff();
		
		
	}
}
