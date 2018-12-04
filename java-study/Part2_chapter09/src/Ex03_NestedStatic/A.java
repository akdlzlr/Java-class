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
//			field1 = 10;	// static은 별개로 존재하므로 A가 있는지 없는지 모름
//			method1();		// 그러므로 A를 매개변수로 받아 사용하는 것은 가능함
			a.field1 = 10;	// 이때 A클래스의 필드와 매서드가 private여도
			a.method1();	// 같은 클래스 안에 있기 때문에 private에 접근할 수 있다.
			field2 = 10;
			method2();
		}
	}
}
