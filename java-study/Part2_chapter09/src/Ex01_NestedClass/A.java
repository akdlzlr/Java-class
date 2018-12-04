package Ex01_NestedClass;

public class A {
	A(){
		System.out.println("A ��ü�� ������");
	}
	
//	�ν��Ͻ� ��� Ŭ����
	public class B{
		B(){
			System.out.println("B ��ü�� ������");
		}
		
		int field1;
		void method1() {
		}
//		int static field2;			���� �ʵ�� ���� �޼ҵ� ������ �Ұ��� �ϴ�.
//		static void method2(){}
	}
	
//	���� ��� Ŭ����
	static class C{
		C(){
			System.out.println("C ��ü�� ������");
		}
		
		int field1;
		void method1() {}
		static int field2;
		static void method2() {}
		
	}
	
//	���� Ŭ����
	void method() {
		class D{
			D(){System.out.println("D ��ü�� ������");}
			int field1;
			void method1() {}
//			static int field2;			���� �ʵ�� ���� �޼ҵ� ������ �Ұ��� �ϴ�.
//			static void method2(){}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}