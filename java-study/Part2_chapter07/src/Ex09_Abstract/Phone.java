package Ex09_Abstract;

public abstract class Phone {		// abstract�� �ν��ͽ�ȭ ����...
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("power on");
	}
	public void turnOff() {
		System.out.println("power off");
	}
}
