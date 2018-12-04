package Ex08_Casting;

public class ParentChildEx {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*
		 parent.fidle2 = "data2";		불가능
		 parent.method3();				불가능
		 */

		if(parent instanceof Child) {
			Child child = (Child) parent;
			child.field2 = "yyy";			// 가능
			child.method3();				// 가능
		}else {
			System.out.println("강제 타입 변경 불가...");
		}
		
		boolean b = parent instanceof People;
		System.out.println("People은 Child의 인스턴스인가 ? "+b);
	}
}
