package chapter6.cartest3;

public class Car {
//	�ʵ�
	int speed;
	
//	�޼ҵ�
	int getSpeed() {
		return speed;
	}
	
	void setSpeed(int speed) {		// ������ �ϸ� �Ǵϱ� void
		this.speed = speed;
	}
	
	void keyTurnOn() {
		System.out.println("Ű�� �����ϴ�.");
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			speed = i;
			System.out.println("�޸��ϴ�. (�ü� : "+speed+"km/h)");
		}
	}
}