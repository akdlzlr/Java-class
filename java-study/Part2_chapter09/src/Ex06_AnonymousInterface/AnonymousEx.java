package Ex06_AnonymousInterface;

public class AnonymousEx {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
//		�ʵ� �̿�
		anony.field.turnOn();
//		���� ���� �̿�
		anony.method1();
//		�Ű��� �̿�
		anony.method2(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("����Ʈ Ƽ�� �մϴ�.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("����Ʈ Ƽ�� ���ϴ�.");
			}
		});
	}
}
