package chapter5;

public class Test01_ArrayTest {
	public static int Sum(int[] arr) { // 순회, 제일 많이 하는 작업이다
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void printArray(int[] arr) { // 순회 매서드라고 한다.
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int[] scores = { 80, 60, 30, 90, 60, 50, 70, 10, 40, 100 }; // 배열의 요소
		double avg;

		avg = Sum(scores) / (double) (scores.length);
		printArray(scores);
		System.out.println("합계 : " + Sum(scores) + ", 평균 : " + avg);

//=====예제.... 최소, 최대, 인덱스 ==========================================

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
		System.out.println("최소값 : " + min + " 인덱스 : " + minIndex);
		System.out.println("최대값 : " + scores[maxIndex] + " 인덱스 : " + maxIndex);
//		예제 2 주어진 범위에서 최소값 찾기,오름차순 정렬
//		선택정렬(selection sort)
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
//			이중루프 O(n^2)
		}
		printArray(scores);
	}
}