package Ex01_Interface;

public class RemoteControl2 {
	public static void main(String[] args) {
//		�޼��尡 �Ѱ��̰� �޼��尡 �� ���϶� ���� ���̴� ����̴�.
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("������ �մϴ�.");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("������ ���ϴ�.");
				
			}
			
			@Override
			public void setVolume(int volume) {
				System.out.println("�Ҹ��� ���� �մϴ�.");
			}
		};
			
		rc.turnOn();
		rc.setVolume(0);
		rc.turnOff();
	}
}