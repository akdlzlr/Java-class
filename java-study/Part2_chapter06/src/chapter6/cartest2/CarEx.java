package chapter6.cartest2;

public class CarEx {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5);
//		myCar.gas = 5;			�ν��Ͻ��� �ִ� ���� ������ �ٲ�, �ʵ带 �ܺο��� �ٲٴ°� �����ʴ�.
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("���");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("���ᰡ �����");
		}else {
			System.out.println("���Ḧ �����Ͻÿ�.");
		}
	}
}