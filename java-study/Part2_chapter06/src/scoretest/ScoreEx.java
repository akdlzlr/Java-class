package scoretest;

import java.util.Scanner;

public class ScoreEx {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�й� : ");
		String sno=scanner.nextLine();	
		
		System.out.println("�̸� : ");
		String name = scanner.nextLine();
		
		System.out.println("���� : ");
		int score = scanner.nextInt();
		scanner.nextLine();
		
//		int score = Integer.parseInt(scanner.nextLine());	// ���ڸ� �Է� �޴°�
				
		Score s1 = new Score(sno,name,score);
		System.out.println(s1);
	}
}
