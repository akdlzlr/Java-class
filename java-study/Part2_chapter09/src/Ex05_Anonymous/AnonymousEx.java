package Ex05_Anonymous;

public class AnonymousEx {
	public static void main(String[] args) {
		
		Anonymous anony = new Anonymous();
		
//		�͸� ��ü �ʵ� ���
		anony.field.wake();
		
		
//		�͸� ��ü ���ú��� ���
		anony.method1();
		
		
//		�͸� ��ü �Ű��� ���				���� ����ϴ� �����....
		anony.method2(new Person(){
			void study(){
				System.out.println("�����մϴ�.");
			}
			
			void wake() {
				System.out.println("8�ÿ� �Ͼ�ϴ�.");
				study();
			}
		});
//		�׷��� �� �͸� ��ü�� ���� ���°� �� ȿ����... �� ����� ������ �����϶� ���� ����
	}
}