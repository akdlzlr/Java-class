package Ex01_Interface;

public interface RemoteControl {		// interface�� �⺻ �����̴�
//	���
	int MAX_VOLUME = 10;	// final static ���� ����
	int MIN_VOLUME = 0;		// �⺻������ public�� ����Ʈ ���̴�
		
//	�߻� �޼��� - �޼��� ����θ� �ۼ�
	void turnOn();			// abstract ���� ����
	void turnOff();			// �⺻������ public�� ����Ʈ ���̴�
	void setVolume(int volume);

	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó��");
		}else {
			System.out.println("���� ����");
		}
	}
	
	static void changeBattery() {
		System.out.println("�������� ��ȯ");
	}
}