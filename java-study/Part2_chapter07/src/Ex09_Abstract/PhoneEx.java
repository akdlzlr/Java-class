package Ex09_Abstract;

public class PhoneEx {
	public static void main(String[] args) {
		// Phone phone = new Phone(); �Ұ��� = Phone�� abstract�̱� ������
		SmartPhone smartPhone = new SmartPhone("�Ѹ�");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
		Phone phone = new SmartPhone("�����");
		
		phone.turnOn();
		((SmartPhone)phone).internetSearch();	
		// SmartPhone�� internet�� ����ϱ� ���� DownCasting�� �̿��Ͽ� �ڽ�Ÿ������ ������ȯ��
		phone.turnOff();
	
	}
}
