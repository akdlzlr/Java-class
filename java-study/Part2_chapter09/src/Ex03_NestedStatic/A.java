package Ex03_NestedStatic;

public class A {
	private int field1;
	
	void method1() {}
	
	static int field2;
	
	static void method2() {}
	
	class B {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			
			method2();
		}
	}
	
	static class C {
		void method(A a) {
//			field1 = 10;	// static�� ������ �����ϹǷ� A�� �ִ��� ������ ��
//			method1();		// �׷��Ƿ� A�� �Ű������� �޾� ����ϴ� ���� ������
			a.field1 = 10;	// �̶� AŬ������ �ʵ�� �ż��尡 private����
			a.method1();	// ���� Ŭ���� �ȿ� �ֱ� ������ private�� ������ �� �ִ�.
			field2 = 10;
			method2();
		}
	}
}
