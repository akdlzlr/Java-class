package Ex09_Abstract;

public abstract class Phone {		// abstract로 인스터스화 방지...
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
