package edu.iot.part3.chapter18.ex03;

import java.io.InputStream;

public class SystemInEx {
	public static void main(String[] args) throws Exception {
		
//		System.out.println("== Menu ==");
//		System.out.println("1. 예금 조회");
//		System.out.println("2. 예금 출금");
//		System.out.println("3. 예금 입금");
//		System.out.println("4. 종료 하기");
//		System.out.println("메뉴를 선택하시오");
//		
		InputStream is = System.in;
//		char inputChar = (char) is.read();
		
//		switch(inputChar) {
//		case '1':
//			System.out.println("예금 조회를을선택하셨습니다.");
//			break;
//		case '2':
//			System.out.println("예금 출금을 선택하셨습니다.");
//			break;
//		case '3':
//			System.out.println("예금 입금을 선택하셨습니다.");
//			break;
//		case '4':
//			System.out.println("종료  하기를 선택하셨습니다.");
//			break;
//		}
//		
		byte[] datas = new byte[100];
		
		System.out.print("이름 : ");
		int nameBytes = is.read(datas);
		String name = new String(datas, 0, nameBytes-2);
		
		System.out.print("하고싶은 말 : ");
		int commentBytes = is.read(datas);
		String comment = new String(datas, 0, commentBytes-2);
		
		System.out.println("입력한 이름 : "+name);
		System.out.println("입력한 하고싶은 말 : "+comment);

	}
}