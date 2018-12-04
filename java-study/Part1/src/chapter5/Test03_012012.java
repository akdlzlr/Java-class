package chapter5;

import java.util.Scanner;

import lib.Random;

public class Test03_012012 {
	public static void main(String[] args) throws Exception {
		int num;

		System.out.println("가위, 바위, 보");
		System.out.println("선택 : ");

		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		Srp me = Srp.valueOf(input);	// 사용자로 부터 받은 문자를 열거의 값으로 바꿈?
										// 받은 값을 열거안에 있는 값으로 바꿈
		num = Random.rand(0, 3);
		
		Srp[] a = Srp.values();			// Srp의 값을 인덱스로 바로 가져오지 못해 Srp을 values로
		Srp com = a[num];				// Srp 배열 타입의 a에 저장하여 a에서 인덱스로 값을 뽑아냄
	
		System.out.println("나 : " + me + "," + " com : " + com);

		if (me == com) {
			System.out.println("비겼습니다.");
		} else if ((me == Srp.가위 && com == Srp.바위)
					|| (me == Srp.바위 && com == Srp.보) 
						|| (me == Srp.보 && com == Srp.가위)) {
			System.out.println("졌습니다.");
		} else {
			System.out.println("이겼습니다.");
		}
	}
}