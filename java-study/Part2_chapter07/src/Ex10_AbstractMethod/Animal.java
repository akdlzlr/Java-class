package Ex10_AbstractMethod;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("���� ���ϴ�.");
	}
	
	public abstract void sound();		// �߻� �޼��带 ����ϱ� ���ؼ� �߻� Ŭ���������� 
}
