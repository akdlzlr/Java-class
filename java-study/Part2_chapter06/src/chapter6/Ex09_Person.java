package chapter6;

public class Ex09_Person {
	final String nation = "korea";	//대입 한번만 허용
	final String ssn;
	String name;
	
	public Ex09_Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}