package chapter7;

public class Ex05_ChildEx {
	public static void main(String[] args) {
		Ex05_child child = new Ex05_child();
		
		Ex05_Parent parent = child;	// 자동 변환
		
		parent.method1();
		parent.method2();
//		parent.method3();		부모 클래스에는 method3이 없다.
	}
}