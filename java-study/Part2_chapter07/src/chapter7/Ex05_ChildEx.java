package chapter7;

public class Ex05_ChildEx {
	public static void main(String[] args) {
		Ex05_child child = new Ex05_child();
		
		Ex05_Parent parent = child;	// �ڵ� ��ȯ
		
		parent.method1();
		parent.method2();
//		parent.method3();		�θ� Ŭ�������� method3�� ����.
	}
}