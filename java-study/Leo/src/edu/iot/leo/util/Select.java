package edu.iot.leo.util;

public class Select extends Sort {
//	�޼���
	@Override	
	public void sort(int[] arr) {
		int minIndex;
		int min;

		for (int j = 0; j < arr.length; j++) {
			minIndex = j;
			min = arr[j];

			for (int i = j; i < arr.length; i++) {
				if (arr[i] < min) {
					min = arr[i];
					minIndex = i;
				}
			}
			swap(arr, j, minIndex);	// �ڵ带 ���� �� �� �ִ�.
		}
	}
}