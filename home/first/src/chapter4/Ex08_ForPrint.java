package chapter4;

public class Ex08_ForPrint {
	public static void main(String[] args) {
		int i=1;
		for(; i<=10;i++) {
			System.out.println(i);
		}
		System.out.println("���� i �� : "+i); //for���� �ִ� i�� for�������� ���� = ��������
	 
		for(i=10;i>=1;i--) {
			System.out.println(i);
		}
	}
}