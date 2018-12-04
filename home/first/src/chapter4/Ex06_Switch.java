package chapter4;

import lib.Random;

public class Ex06_Switch {
	public static void main(String[] args) {
		int num = Random.rand(1, 6);
		switch (num) {
		case 1:
			System.out.println("1번이 나옴");
			break;
		case 2:
			System.out.println("2번이 나옴");
			break;
		case 3:
			System.out.println("3번이 나옴");
			break;
		case 4:
			System.out.println("4번이 나옴");
			break;
		case 5:
			System.out.println("5번이 나옴");
			break;
		case 6:
			System.out.println("6번이 나옴");
			break;
		}
	}
}
//		case 1:
//		case 3:
//		case 5:
//			break;             일때 조건이 1이면 1->3->5를 한다

