package chapter6.cartest3;

public class Car {
//	필드
	int speed;
	
//	메소드
	int getSpeed() {
		return speed;
	}
	
	void setSpeed(int speed) {		// 설정만 하면 되니까 void
		this.speed = speed;
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			speed = i;
			System.out.println("달립니다. (시속 : "+speed+"km/h)");
		}
	}
}