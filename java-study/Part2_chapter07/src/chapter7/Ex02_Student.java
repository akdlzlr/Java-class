package chapter7;

public class Ex02_Student extends Ex02_People {
//	�ʵ�
	public int studentNo;

//	������
	public Ex02_Student(String name, String ssn, int studentNo) {
		super(name, ssn);
//		���� super�� �����ϸ� �ڵ����� super();�� ������ �� �� �ڵ����� ����µ� 
//		�θ�Ŭ������ default ������, public Ex02_People () {}�� �����Ƿ� �����߻�
		this.studentNo = studentNo;
	}
}