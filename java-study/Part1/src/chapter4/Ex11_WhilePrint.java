package chapter4;

public class Ex11_WhilePrint {
	public static void main(String[] args) {
		int i = 1;
		int sum=0;
		while(i<=10) {
			sum+=i;
			i++;
		}
		System.out.println("1~"+(i-1)+" гу : "+sum);
	}
}
