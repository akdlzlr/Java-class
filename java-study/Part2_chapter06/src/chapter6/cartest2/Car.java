package chapter6.cartest2;

public class Car {
//	필드
	int gas;
//	생성자
//	메소드
	void setGas(int gas) {
		this.gas=gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없다");
		return false;
		}
		System.out.println("gas가 있다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달림. 남은 연료 : "+gas);
				gas-=1;
			}else {
				System.out.println("멈춤. 남은 연료 : "+gas);
				return;
			}
		}
	}
}
