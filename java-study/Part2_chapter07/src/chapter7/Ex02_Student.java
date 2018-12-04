package chapter7;

public class Ex02_Student extends Ex02_People {
//	필드
	public int studentNo;

//	생성자
	public Ex02_Student(String name, String ssn, int studentNo) {
		super(name, ssn);
//		위에 super를 생략하면 자동으로 super();이 컴파일 할 때 자동으로 생기는데 
//		부모클래스에 default 생성자, public Ex02_People () {}이 없으므로 에러발생
		this.studentNo = studentNo;
	}
}