package chapter4;

import lib.Random;

public class Test01_Array {

	public static void main(String[] args) {
		int num=0;
		int x,y;
		num=Random.rand(0, 24);
		x=num/5;
		y=num%5;
		
		System.out.println(num);
		
		for(int n=0;n<=4;n++) {
			for(int m=0;m<=4;m++) {
				if(n==x&&m==y) {
					System.out.print("["+n+","+m+"] ");
				}else {
					System.out.print("("+n+","+m+") ");
				}
			}
			System.out.println();
		}
	}
}