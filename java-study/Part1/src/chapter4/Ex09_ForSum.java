package chapter4;
import lib.Random;

public class Ex09_ForSum {		

	public static void main(String[] args) {

		int sum=0;
		int i=1;
		
		for(;i<=100;i++) {
			sum +=i;
		}
		System.out.println("1~100합 : "+sum);
		
		sum=0;
		for(i=0;i<=100;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("1~100 짝수의 합 : "+sum);
		sum=0;
		
		for(i=2;i<=100;i+=2) {
			sum+=i;
		}
		System.out.println("1~100 짝수의 합 : "+sum);
		sum=0;
		
		for(i=1;i<=100;i+=2) {
			sum+=i;
		}
		System.out.println("1~100 홀수의 합 : "+sum);
		sum=0;
		
		int n=Random.rand(1, 100);
		
		for(i=1;i<=n;i++) {     // 조건식의 조건을 랜덤 또는 변수로 받아서 반복하게 하는
			sum+=i;				// 경우가 더 많다.
		}
		System.out.println(n+"번 합산한 값 : "+sum);
		sum=0;
		for(;;) {          // 무한루프
			System.out.println("룰루랄라~~~~~~~~~~~");
		}
	}
}