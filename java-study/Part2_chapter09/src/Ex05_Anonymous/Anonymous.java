package Ex05_Anonymous;

public class Anonymous {
//	필드로 익명 자식 객체 생성
	Person field = new Person() {
		void work() {
			System.out.println("출근합니다.");
		}
// 		field.work() 실행 불가하지만
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
//		오버라이딩 된 wake()에서 work() 함수를 호출하는 건 가능하다.
	};
	
//	지역 변수로 익명 자식 객체 생성
	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		localVar.wake();
	}
//	호출 하는 형태 눈여겨 보기, 제일 많이 사용함...
	void method2(Person person) {
		person.wake();
	}
}