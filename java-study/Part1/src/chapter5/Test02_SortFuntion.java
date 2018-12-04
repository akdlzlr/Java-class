package chapter5;

public class Test02_SortFuntion {
//	swap함수
	public static void swap(int[] a, int i1, int i2) {
		int temp;
		temp = a[i1];
		a[i1] = a[i2];
		a[i2] = temp;
	}

//	선택정렬
	public static void sortByselection(int[] a) {
		int minIndex;
		int min;

		for (int j = 0; j < a.length; j++) {
			minIndex = j;
			min = a[j];

			for (int i = j; i < a.length; i++) {
				if (a[i] < min) {
					min = a[i];
					minIndex = i;
				}
			}
			swap(a, j, minIndex);
		}
	}

//	버블정렬
	public static void sortByBubble(int[] a) {

		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < (a.length - j - 1); i++) {
				if (a[i] > a[i + 1]) {
					swap(a, i, i + 1);
				}
			}
		}
	}

//	삽입정렬
	public static int[] sortByInsertion(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int data = a[i];
			int aux;
			for (aux = i - 1; aux >= 0 && data < a[aux]; aux--) {
				a[aux + 1] = a[aux];
//				Test01_ArrayTest.printArray(a);
			}
			a[aux + 1] = data;
//			Test01_ArrayTest.printArray(a);
		}
		return a;
	}

//	이진검색
	public static int search(int[] arr, int target) {
		int first = 0;
		int last = arr.length;
		int mid;

		while (first <= last) {
			mid = (first + last) / 2;
			if (target == arr[mid]) {
				return mid;
			} else {
				if (target < arr[mid]) {
					last = mid - 1;
				} else {
					first = mid + 1;
				}
			}

		}
		return -1;
	}

	public static void main(String[] args) {

		int m = 0;
		int[] scores = { 80, 60, 30, 90, 20, 50, 70, 10, 40, 100 };

//		sortByselection(scores);
//		sortByBubble(scores);
		sortByInsertion(scores);

		Test01_ArrayTest.printArray(scores);
		m = search(scores, 60);
		if(m>=0) {
		System.out.println("찾는 값의 인덱스는 "+m+"이다.");
		}else {
			System.out.println("값 없다.");
		}
	}
}