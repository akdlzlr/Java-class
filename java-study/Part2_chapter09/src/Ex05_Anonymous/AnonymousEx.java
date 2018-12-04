package Ex05_Anonymous;

public class AnonymousEx {
	public static void main(String[] args) {
		
		Anonymous anony = new Anonymous();
		
//		익명 객체 필드 사용
		anony.field.wake();
		
		
//		익명 객체 로컬변수 사용
		anony.method1();
		
		
//		익명 객체 매개값 사용				자주 사용하는 기법임....
		anony.method2(new Person(){
			void study(){
				System.out.println("공부합니다.");
			}
			
			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}
		});
//		그러나 이 익명 객체는 따로 쓰는게 더 효율적... 윗 기법은 내용이 한줄일때 자주 쓰임
	}
}