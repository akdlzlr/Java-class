package chapter4;

import java.util.Scanner;

public class Test02_PrimeNumber {
	public static void main(String[] args) {
		
		//boolean result = true;
		Scanner scanner=new Scanner(System.in);
		int n;
		n=scanner.nextInt(); 
		int i=2;
		for(;i<n;i++) {
			if(n%i==0) {
				//result = false;
				break;
			}
		}
		//if (result) {
		if(i==n) {
			System.out.println(n+"�� �Ҽ��Դϴ�.");
		}else {
			System.out.println(n+"�� �Ҽ��� �ƴմϴ�.");
		}
	}
}