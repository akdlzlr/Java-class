package chapter5;
//Call by value ������ ���� ��
public class Ex01_SwapEx {
	
	public static void swap(int a, int b) {
		int t = a;
		a=b;
		b=t;
		System.out.println("ȣ�� �� :"+a+","+b);
	}
		
	public static void main(String[] args) {  //�굵 ��������
		int a =10;
		int b =20;
		
		System.out.println("ȣ�� �� :"+a+","+b);
		swap(a,b); // call by value : �Ű������� ����
		//�⺻ Ÿ���� �״�� ����ǹǷ� ���� �޼ҵ��� ���� ������ �ʴ´�?????
		System.out.println("ȣ�� �� :"+a+","+b);
	}   // �������� �� 3�� a,b,main(args) 
}
// ������ swap �ż��忡���� ��, ���纻�� �Ѿ��