package chapter6;

public class Ex04_CalculatorMatod {
//	�ʵ� ������ ����, ���°� ����.

	PowerState currentState; // �ʵ� ����
	double result;
	
//	������
	public Ex04_CalculatorMatod() {
		super();
		currentState = PowerState.OFF;
	}

	public Ex04_CalculatorMatod(PowerState currentState) {
		super();
		this.currentState = currentState;
	}

//	���� ���� �޼���
	void powerOn() {
		System.out.println("������ �մϴ�.");
		currentState = PowerState.ON;
	}

	void powerOff() {
		System.out.println("������ ���ϴ�.");
		currentState = PowerState.OFF;
	}

	boolean isPowerOn() {
		return currentState == PowerState.ON;
	}

//	���� ���� �޼���
	
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
	
//	���簢���� ����
	double areaRectangle(double width) {
		return width * width;
	}

//	���簢���� ����
	double areaRectangle(double width, double height) {
		return width * height;
	}
}