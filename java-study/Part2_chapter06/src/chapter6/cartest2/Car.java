package chapter6.cartest2;

public class Car {
//	�ʵ�
	int gas;
//	������
//	�޼ҵ�
	void setGas(int gas) {
		this.gas=gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas�� ����");
		return false;
		}
		System.out.println("gas�� �ִ�.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("�޸�. ���� ���� : "+gas);
				gas-=1;
			}else {
				System.out.println("����. ���� ���� : "+gas);
				return;
			}
		}
	}
}
