package chapter6;

public class Ex09_PersonEx {
	public static void main(String[] args) {
	
		Ex09_Person p1 = new Ex09_Person("123456-1234567","계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation = "usa";			final은 수정하지 못하여
//		p1.ssn = "654321-7654321";	문법 오류 발생
		p1.name = "김유신";
	
	}
}
