package edu.iot.leo.util;

public class Insert extends Sort {
//	�޼���
	@Override
	public void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int data = arr[i];	// ����
			int aux;
			for (aux = i - 1; aux >= 0 && data < arr[aux]; aux--) {
				arr[aux + 1] = arr[aux];
//				Test01_ArrayTest.printArray(a);
			}
			arr[aux + 1] = data;
//			Test01_ArrayTest.printArray(a);
		}
	}
}