package chapter6;

public class Ex03_Korean {
	public static void main(String[] args) {
		
		Class_Korean k1 = new Class_Korean("¹ÚÀÚ¹Ù","01012341234");
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		Class_Korean k2 = new Class_Korean();
		System.out.println(k2.nation);
		System.out.println(k2.name);
		System.out.println(k2.ssn);
	}
}
