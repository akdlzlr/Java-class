package chapter4;

import java.util.Scanner;

public class Ex13_DoWhile {
	public static void main(String[] args) {
	
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);  //open이 포함
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();  // 입력받은것을 그대로
 			System.out.println(inputString);   // 출력하는 것을 에코라 한다.
		}while(!inputString.equals("q"));	   // 문자열 비교 메서드...
		
		System.out.println();
		System.out.println("프로그램 종료");
		
	}
}