package chapter4;

import lib.Random;

public class Ex06_Switch {
	public static void main(String[] args) {
		int num = Random.rand(1, 6);
		switch (num) {
		case 1:
			System.out.println("1���� ����");
			break;
		case 2:
			System.out.println("2���� ����");
			break;
		case 3:
			System.out.println("3���� ����");
			break;
		case 4:
			System.out.println("4���� ����");
			break;
		case 5:
			System.out.println("5���� ����");
			break;
		case 6:
			System.out.println("6���� ����");
			break;
		}
	}
}
//		case 1:
//		case 3:
//		case 5:
//			break;             �϶� ������ 1�̸� 1->3->5�� �Ѵ�

