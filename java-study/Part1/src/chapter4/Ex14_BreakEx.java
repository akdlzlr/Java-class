package chapter4;

import lib.Random;

public class Ex14_BreakEx {
	public static void main(String[] args) {
		
		while(true) {
			int num = Random.rand(1,6);
			System.out.println(num);
			if(num==6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}