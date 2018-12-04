package chapter3;

import lib.BinaryUtil;         //라이브러리 패키지의 메소드를 가져옴

public class Ex06_BitReverse {
	
	public static void main(String[] args) {

		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 + 1;
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4 + 1;
		
		BinaryUtil.printBinary(v1);
		BinaryUtil.printBinary(v2);
		BinaryUtil.printBinary(v3);
			
		lib.Decoration.printCharacter('=', 50);
		
		BinaryUtil.printBinary(v4);
		BinaryUtil.printBinary(v5);
		BinaryUtil.printBinary(v6);
//		System.out.println(toBinaryString(v1)+
//								"(십진수 : "+v1+")");
//		System.out.println(toBinaryString(v2)+
//								"(십진수 : "+v2+")");
//		System.out.println(toBinaryString(v3)+
//								"(십진수 : "+v3+")");		
//		System.out.println(toBinaryString(v4)+
//								"(십진수 : "+v4+")");
//		System.out.println(toBinaryString(v5)+
//								"(십진수 : "+v5+")");
//		System.out.println(toBinaryString(v6)+
//								"(십진수 : "+v6+")");
	}
}