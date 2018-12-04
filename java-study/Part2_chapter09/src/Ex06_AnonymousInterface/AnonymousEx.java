package Ex06_AnonymousInterface;

public class AnonymousEx {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
//		필드 이용
		anony.field.turnOn();
//		로컬 변수 이용
		anony.method1();
//		매개값 이용
		anony.method2(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("스마트 티비를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("스마트 티비를 끕니다.");
			}
		});
	}
}
