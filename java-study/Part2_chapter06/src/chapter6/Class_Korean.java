package chapter6;

public class Class_Korean {
	String nation = "대한민국";
	String name;
	String ssn;
	
	public Class_Korean(String name, String ssn) {
		this.name = name;				// this는 자신을 참조함, 필드변수를 참조
		this.ssn = ssn;					// 필드 변수는 파란색, 지역 변수는 갈색
	}
	
	public Class_Korean() {
		
	}
}
