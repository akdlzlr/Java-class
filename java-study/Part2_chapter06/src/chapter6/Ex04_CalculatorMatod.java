package chapter6;

public class Ex04_CalculatorMatod {
//	필드 정보가 없다, 상태가 없다.

	PowerState currentState; // 필드 생성
	double result;
	
//	생성자
	public Ex04_CalculatorMatod() {
		super();
		currentState = PowerState.OFF;
	}

	public Ex04_CalculatorMatod(PowerState currentState) {
		super();
		this.currentState = currentState;
	}

//	전원 제어 메서드
	void powerOn() {
		System.out.println("전원을 켭니다.");
		currentState = PowerState.ON;
	}

	void powerOff() {
		System.out.println("전원을 끕니다.");
		currentState = PowerState.OFF;
	}

	boolean isPowerOn() {
		return currentState == PowerState.ON;
	}

//	연산 관련 메서드
	
	double clear() {
		result=0;
		return result;
	}
	
	int plus(int x, int y) {
		result = x + y;
		return (int)result;
	}
	
	int plus(int x) {
		result +=x;
		return (int)result;
	}

	double divide(int x, int y) {
		result = (double) x / (double) y;
		return result;
	}
	
	double divide(int x) {
		result /=x;
		return result;
	}
	
//	정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}

//	직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
}