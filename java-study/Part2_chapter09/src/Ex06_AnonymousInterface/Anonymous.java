package Ex06_AnonymousInterface;

public class Anonymous {
//	�ʵ�
	RemoteControl field = new RemoteControl(){
		public void turnOn() {
			System.out.println("TV�� �մϴ�.");
		}
		public void turnOff() {
			System.out.println("TV�� ���ϴ�.");
		}
//		�������̽� �̹Ƿ� ����� ����� �ִ°��� �ʼ��̴�.
	};
	
//	��������
	void method1() {
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("������� �մϴ�.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("������� ���ϴ�.");
			}
		};
//		���� ���� ���
		localVar.turnOn();
	}
	
//	ȣ�� �� ����
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}