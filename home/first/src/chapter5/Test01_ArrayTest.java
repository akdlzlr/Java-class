package chapter5;

public class Test01_ArrayTest {
	public static int Sum(int [] arr) {		//��ȸ, ���� ���� �ϴ� �۾��̴�
		int sum=0;
		for(int i=0;i<=9;i++){
			sum+=arr[i];
		}
		return sum;
	}
	public static void printArray(int[] arr) {		//��ȸ �ż����� �Ѵ�.
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] scores = {80,88,78,45,90,68,45,74,62,50};	// �迭�� ���
		double avg;
		
		avg = Sum(scores)/10.;
		printArray(scores);
		System.out.println("�հ� : "+Sum(scores)+", ��� : "+avg);
	}
}