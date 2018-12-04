package scoretest;

import java.util.Scanner;

public class ScoreEx {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("학번 : ");
		String sno=scanner.nextLine();	
		
		System.out.println("이름 : ");
		String name = scanner.nextLine();
		
		System.out.println("점수 : ");
		int score = scanner.nextInt();
		scanner.nextLine();
		
//		int score = Integer.parseInt(scanner.nextLine());	// 숫자를 입력 받는것
				
		Score s1 = new Score(sno,name,score);
		System.out.println(s1);
	}
}
