package chapter4;

public class Ex05_IfNested {
	public static void main(String[] args) {
		int score = (int)(Math.random()*20)+81;
		System.out.println("���� : "+score);
		
		String grade;     // Ŭ������ ����Ÿ Ÿ������ �� �� �ִ�. ���ڿ��� �����ϴ� Ŭ����
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
		System.out.println("���� : "+grade);
	}
}
