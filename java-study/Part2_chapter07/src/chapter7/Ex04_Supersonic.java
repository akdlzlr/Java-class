package chapter7;

public class Ex04_Supersonic extends Ex04_Airplane {
	
//	���
	public static final int NORMAL = 1;
	public final static int SUPERSONIC = 2;

//	�ʵ�
	public int flyMode = NORMAL;

//	�޼���
	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("������ ������ �մϴ�.");
		} else {
			super.fly(); // Airplane ��ü(�θ� �ν��Ͻ�)�� fly() �޼ҵ带 ȣ��
		}
	}
}
