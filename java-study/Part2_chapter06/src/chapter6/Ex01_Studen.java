package chapter6;

public class Ex01_Studen {

	public static void main(String[] args) {
		Class_Student s1 = new Class_Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		Class_Student s2 = new Class_Student();
		System.out.println("s2 변수가 Student 객체를 참조합니다.");
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1==s2);
		
		s2=s1;
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1==s2);
	}
}
