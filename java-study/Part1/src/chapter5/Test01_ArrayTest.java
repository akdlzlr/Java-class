package chapter5;

public class Test01_ArrayTest {
	public static int Sum(int[] arr) { // ��ȸ, ���� ���� �ϴ� �۾��̴�
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void printArray(int[] arr) { // ��ȸ �ż����� �Ѵ�.
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int[] scores = { 80, 60, 30, 90, 60, 50, 70, 10, 40, 100 }; // �迭�� ���
		double avg;

		avg = Sum(scores) / (double) (scores.length);
		printArray(scores);
		System.out.println("�հ� : " + Sum(scores) + ", ��� : " + avg);

//=====����.... �ּ�, �ִ�, �ε��� ==========================================

		int min = scores[0];
		int max = scores[0];
		int minIndex = 0;
		int maxIndex = 0;

		for (int i = 0; i < scores.length; i++) {
			if (scores[i] < min) {
				min = scores[i];
				minIndex = i;
			}
			if (scores[i] > max) {
				max = scores[i];
				maxIndex = i;
			}
		}
		System.out.println("�ּҰ� : " + min + " �ε��� : " + minIndex);
		System.out.println("�ִ밪 : " + scores[maxIndex] + " �ε��� : " + maxIndex);
//		���� 2 �־��� �������� �ּҰ� ã��,�������� ����
//		��������(selection sort)
		int a;
		for (int j = 0; j < scores.length; j++) {
			minIndex = j;
			min = scores[j];
			for (int i = j; i < scores.length; i++) {
				if (scores[i] < min) {
					min = scores[i];
					minIndex = i;
				}
			}
			a = scores[j];
			scores[j] = scores[minIndex];
			scores[minIndex] = a;
//			���߷��� O(n^2)
		}
		printArray(scores);
	}
}