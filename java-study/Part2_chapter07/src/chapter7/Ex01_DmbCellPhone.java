package chapter7;

public class Ex01_DmbCellPhone extends Ex01_CellPhone {	// extends �θ�Ŭ������
//	�ʵ�
	int channel;
//	������
	Ex01_DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
//	�޼���
	void turnOnDmb() {
		System.out.println("ä��  "+ channel+"�� DMB ��� ������ �����մϴ�.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä�� "+channel+"������ �ٲ�");
	}
	
	void turnOffDmb() {
		System.out.println("DMB ����� ����");
	}
}
