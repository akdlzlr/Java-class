package chapter4;

import java.util.Scanner;

public class Ex13_DoWhile {
	public static void main(String[] args) {
	
		System.out.println("�޽����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���.");
		
		Scanner scanner = new Scanner(System.in);  //open�� ����
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();  // �Է¹������� �״��
 			System.out.println(inputString);   // ����ϴ� ���� ���ڶ� �Ѵ�.
		}while(!inputString.equals("q"));	   // ���ڿ� �� �޼���...
		
		System.out.println();
		System.out.println("���α׷� ����");
		
	}
}