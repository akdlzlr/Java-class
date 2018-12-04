package Ex05_Anonymous;

public class Anonymous {
//	�ʵ�� �͸� �ڽ� ��ü ����
	Person field = new Person() {
		void work() {
			System.out.println("����մϴ�.");
		}
// 		field.work() ���� �Ұ�������
		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
		}
//		�������̵� �� wake()���� work() �Լ��� ȣ���ϴ� �� �����ϴ�.
	};
	
//	���� ������ �͸� �ڽ� ��ü ����
	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("��å�մϴ�.");
			}
			@Override
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk();
			}
		};
		localVar.wake();
	}
//	ȣ�� �ϴ� ���� ������ ����, ���� ���� �����...
	void method2(Person person) {
		person.wake();
	}
}