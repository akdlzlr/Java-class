package chapter4;

public class Ex01_If {
	public static void main(String[] args) {
		int score = 93;
		
		if(score>=90) {
			System.out.println("점수가 90보다 크다");
			System.out.println("등급은 A 입니다.");
		}
		if(score<90)
			System.out.println("점수가 90보다 작다");
		System.out.println("등급은 B 입니다."); 
//		조건문 괄호 안에 포함되지 않아 항상 출력
	}
}






//올바른 코딩
//if(score<90) {
//	System.out.println("점수가...");
//	System.out.println("등급은...");
//}