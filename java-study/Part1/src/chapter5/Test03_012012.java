package chapter5;

import java.util.Scanner;

import lib.Random;

public class Test03_012012 {
	public static void main(String[] args) throws Exception {
		int num;

		System.out.println("����, ����, ��");
		System.out.println("���� : ");

		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		Srp me = Srp.valueOf(input);	// ����ڷ� ���� ���� ���ڸ� ������ ������ �ٲ�?
										// ���� ���� ���žȿ� �ִ� ������ �ٲ�
		num = Random.rand(0, 3);
		
		Srp[] a = Srp.values();			// Srp�� ���� �ε����� �ٷ� �������� ���� Srp�� values��
		Srp com = a[num];				// Srp �迭 Ÿ���� a�� �����Ͽ� a���� �ε����� ���� �̾Ƴ�
	
		System.out.println("�� : " + me + "," + " com : " + com);

		if (me == com) {
			System.out.println("�����ϴ�.");
		} else if ((me == Srp.���� && com == Srp.����)
					|| (me == Srp.���� && com == Srp.��) 
						|| (me == Srp.�� && com == Srp.����)) {
			System.out.println("�����ϴ�.");
		} else {
			System.out.println("�̰���ϴ�.");
		}
	}
}