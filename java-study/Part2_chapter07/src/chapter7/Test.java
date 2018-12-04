package chapter7;

public class Test extends Ex02_People {

	public int studentNo;

	public Test(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
}