package chapter4;
import lib.Random;

public class Ex09_ForSum {		

	public static void main(String[] args) {

		int sum=0;
		int i=1;
		
		for(;i<=100;i++) {
			sum +=i;
		}
		System.out.println("1~100�� : "+sum);
		
		sum=0;
		for(i=0;i<=100;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("1~100 ¦���� �� : "+sum);
		sum=0;
		
		for(i=2;i<=100;i+=2) {
			sum+=i;
		}
		System.out.println("1~100 ¦���� �� : "+sum);
		sum=0;
		
		for(i=1;i<=100;i+=2) {
			sum+=i;
		}
		System.out.println("1~100 Ȧ���� �� : "+sum);
		sum=0;
		
		int n=Random.rand(1, 100);
		
		for(i=1;i<=n;i++) {     // ���ǽ��� ������ ���� �Ǵ� ������ �޾Ƽ� �ݺ��ϰ� �ϴ�
			sum+=i;				// ��찡 �� ����.
		}
		System.out.println(n+"�� �ջ��� �� : "+sum);
		sum=0;
		for(;;) {          // ���ѷ���
			System.out.println("������~~~~~~~~~~~");
		}
	}
}