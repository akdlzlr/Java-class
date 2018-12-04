package chapter6;

public class Ex10_Singleton {
//	필드
	private static Ex10_Singleton singleton = new Ex10_Singleton();
//	생성자
	private Ex10_Singleton() {

	}
//	메소드
	static Ex10_Singleton getInstance() {
		return singleton;
	}
//	사용할 데이터?
	public void greet(String name) {
		System.out.println("Hello "+name);
	}
	
	public int num() {
		int a=1;
		return a;
	}
}