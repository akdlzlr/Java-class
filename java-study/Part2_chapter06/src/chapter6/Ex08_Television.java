package chapter6;

public class Ex08_Television {
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
//	static 블록의 순서가 의미가 있으므로 먼저 실행할 블록을 앞쪽으로 위치 시켜야한다.
	static {
		info = company +"-"+ model;
	}
}