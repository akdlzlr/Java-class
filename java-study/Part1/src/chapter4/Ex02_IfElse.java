package chapter4;

public class Ex02_IfElse {
	public static void main(String[] args) {
		int score = 85;
		
		if(score>=90) {
			System.out.println("������ 90���� Ů�ϴ�.");
			System.out.println("����� A �Դϴ�.");
		}
		else {
			System.out.println("������ 90���� �۽��ϴ�.");
			System.out.println("����� B �Դϴ�.");
		}
		
		if((score%2)==0) {
			System.out.println("¦���Դϴ�.");
		}
		else{
			System.out.println("Ȧ���Դϴ�.");
		}
	}
}
