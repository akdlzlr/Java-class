package chapter6;

public class Ex10_Singleton {
//	�ʵ�
	private static Ex10_Singleton singleton = new Ex10_Singleton();
//	������
	private Ex10_Singleton() {

	}
//	�޼ҵ�
	static Ex10_Singleton getInstance() {
		return singleton;
	}
//	����� ������?
	public void greet(String name) {
		System.out.println("Hello "+name);
	}
	
	public int num() {
		int a=1;
		return a;
	}
}