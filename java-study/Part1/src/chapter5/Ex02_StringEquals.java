package chapter5;

public class Ex02_StringEquals {
	public static void main(String[] args) {

		String strVar1="신민철";
		String strVar2="신민철";		// 문자열 리터럴이 같으면 객체를 공유함

		if (strVar1==strVar2) {
			System.out.println("strVar1과 strVar2 참조가 같음");
		}else {
			System.out.println("strVar1과 strVar2 참조가 다름");
		}
		
		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2 문자열이 같음");
		}
		
		String strVar3 = new String("신민철1");
		String strVar4 = new String("신민철2");		// new로 힙영역에 새로 만듬
		
		if (strVar3==strVar4) {
			System.out.println("strVar3과 strVar4 참조가 같음");
		}else {
			System.out.println("strVar3과 strVar4 참조가 다름");
		}
		if (strVar3.equals(strVar4)) {
			System.out.println("strVar1과 strVar2 문자열이 같음");
		}
		strVar4 = strVar3;		//strVar3의 주소값을 strVar4에 대입함
		if (strVar3==strVar4) {	//strVar4는 쓰레기값이 되어 자동 삭제됨(jvm 특징)
			System.out.println("strVar3과 strVar4 참조가 같음");
		}else {
			System.out.println("strVar3과 strVar4 참조가 다름");
		}
		if (strVar3.equals(strVar4)) {
			System.out.println("strVar1과 strVar2 문자열이 같음");
		}
	}
}
