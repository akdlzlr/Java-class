package chapter7;

public class Ex01_CellPhone {
//	�ʵ�
	protected String model;		// ��ӽ�ų �ʵ�� protected�� �����ϴ� ���� ����.
	protected String color;		// �ڽ� Ŭ������ �����Ͽ� ������ �� �ִ�.
//	������
	
//	�޼ҵ�
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
