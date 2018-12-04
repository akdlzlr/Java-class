package chapter3;

public class Ex13_Conditional {
	public static void main(String[] args) {
		int score = 85;
		
		char grade = (score>90) ? 'A' : ((score>80) ? 'B' : 'C');
		
		System.out.println(score+"점은 "+grade+"등급 입니다.");
	}
}