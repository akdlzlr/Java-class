package Ex10_AbstractMethod;

public class Cat extends Animal{
	public Cat() {
		this.kind = "������";
	}

	@Override
	public void sound() {
		System.out.println("�߿�!");
	}
}