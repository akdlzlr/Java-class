package chapter5;
//call by reference ������ �ٲ�, ���ϰ��� 2�� �̻� �ް� ���� �� ����� �� �ִ�.
public class Ex01_SwapEx2 {
	public static void swap(int[] arr) {
		int t= arr[0];
		arr[0]=arr[1];
		arr[1]=t;
		// ���κ��� �ּҸ� ������ �����Ͽ� �������� �����Ͱ� ��ȯ�� �̷����
		System.out.println("ȣ�� �� :"+arr[0]+","+arr[1]);
	}
		
	public static void main(String[] args) {  
		int []arr= {10,20};
		
		System.out.println("ȣ�� �� :"+arr[0]+","+arr[1]);
		swap(arr);					// �� ������ �ּҰ��� �Ű������� �Ѿ
		System.out.println("ȣ�� �� :"+arr[0]+","+arr[1]);
		//�������� ����ϴ� ���� �����͸� �ǵ�� main �޼��忡 �ִ� ���� �ٲ�
	} 
}
// ������ main �ż��忡���� �̷����, �ּ�(������)�� �ѱ��