package edu.iot.leo.util;

public class Bubble extends Sort {

	@Override
	public void sort(int[] arr) {
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < (arr.length - j - 1); i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);	//재사용한 코드
				}
			}
		}
	}
}