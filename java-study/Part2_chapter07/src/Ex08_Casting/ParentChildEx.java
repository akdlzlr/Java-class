package Ex08_Casting;

public class ParentChildEx {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*
		 parent.fidle2 = "data2";		�Ұ���
		 parent.method3();				�Ұ���
		 */

		if(parent instanceof Child) {
			Child child = (Child) parent;
			child.field2 = "yyy";			// ����
			child.method3();				// ����
		}else {
			System.out.println("���� Ÿ�� ���� �Ұ�...");
		}
		
		boolean b = parent instanceof People;
		System.out.println("People�� Child�� �ν��Ͻ��ΰ� ? "+b);
	}
}
