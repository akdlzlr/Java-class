package chapter5;

public class Ex02_StringEquals {
	public static void main(String[] args) {

		String strVar1="�Ź�ö";
		String strVar2="�Ź�ö";		// ���ڿ� ���ͷ��� ������ ��ü�� ������

		if (strVar1==strVar2) {
			System.out.println("strVar1�� strVar2 ������ ����");
		}else {
			System.out.println("strVar1�� strVar2 ������ �ٸ�");
		}
		
		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1�� strVar2 ���ڿ��� ����");
		}
		
		String strVar3 = new String("�Ź�ö1");
		String strVar4 = new String("�Ź�ö2");		// new�� �������� ���� ����
		
		if (strVar3==strVar4) {
			System.out.println("strVar3�� strVar4 ������ ����");
		}else {
			System.out.println("strVar3�� strVar4 ������ �ٸ�");
		}
		if (strVar3.equals(strVar4)) {
			System.out.println("strVar1�� strVar2 ���ڿ��� ����");
		}
		strVar4 = strVar3;		//strVar3�� �ּҰ��� strVar4�� ������
		if (strVar3==strVar4) {	//strVar4�� �����Ⱚ�� �Ǿ� �ڵ� ������(jvm Ư¡)
			System.out.println("strVar3�� strVar4 ������ ����");
		}else {
			System.out.println("strVar3�� strVar4 ������ �ٸ�");
		}
		if (strVar3.equals(strVar4)) {
			System.out.println("strVar1�� strVar2 ���ڿ��� ����");
		}
	}
}
