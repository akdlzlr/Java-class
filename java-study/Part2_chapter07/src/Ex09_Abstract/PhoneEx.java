package Ex09_Abstract;

public class PhoneEx {
	public static void main(String[] args) {
		// Phone phone = new Phone(); 불가능 = Phone이 abstract이기 때문임
		SmartPhone smartPhone = new SmartPhone("둘리");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
		Phone phone = new SmartPhone("도우너");
		
		phone.turnOn();
		((SmartPhone)phone).internetSearch();	
		// SmartPhone의 internet을 사용하기 위해 DownCasting을 이용하여 자식타입으로 강제변환함
		phone.turnOff();
	
	}
}
