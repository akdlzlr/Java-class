package Ex06_CarPolymorphism;

public class CarEx {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		for(int i = 1; i <= 5; i++) {
			int problemLocation = myCar.run();
			
//			switch(problemLocation) {
//			case 1:
//				System.out.println("�տ��� �ѱ� Ÿ�̾�� ��ü");
//				myCar.frontLeftTire = new HankookTire("�տ���",15);	// �������� Ư¡! ���� �� ���� �߿�!
//				break;
//			case 2:
//				System.out.println("�տ����� ��ȣ Ÿ�̾�� ��ü");
//				myCar.frontRightTire = new KumhoTire("�տ�����", 14);
//				break;
//			case 3:
//				System.out.println("�ڿ��� �ѱ� Ÿ�̾�� ��ü");
//				myCar.backLeftTire = new HankookTire("�ڿ���", 18);
//				break;
//			case 4:
//				System.out.println("�ڿ����� ��ȣ Ÿ�̾�� ��ü");
//				myCar.backRightTire = new KumhoTire("�ڿ�����", 15);
//				break;
//			
			if(problemLocation != 0) {
//				System.out.println(myCar.tires[problemLocation-1].location+
//																	"�ѱ�Ÿ�̾�� ��ü");
//				myCar.tires[problemLocation-1] = new HankookTire(
//										myCar.tires[problemLocation-1].location,15);
			myCar.changeTire(problemLocation, 
					new HankookTire(problemLocation+"Ÿ�̾�",20));
			
			}
		System.out.println("--------------------------------------");
		}
	}
}