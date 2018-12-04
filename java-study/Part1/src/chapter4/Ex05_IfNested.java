package chapter4;

public class Ex05_IfNested {
	public static void main(String[] args) {
		int score = (int)(Math.random()*20)+81;
		System.out.println("점수 : "+score);
		
		String grade;     // 클래스를 데이타 타입으로 쓸 수 있다. 문자열을 저장하는 클래스
		if(score>=90) {
			if(score>=95) {
				grade = "A+";
			}else {
				grade = "A";
			}
		}else {
			if(score>=85) {
				grade = "B+";
			}else {
				grade = "B";
			}
		}
		System.out.println("학점 : "+grade);
	}
}
