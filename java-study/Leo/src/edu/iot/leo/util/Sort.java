package edu.iot.leo.util;

public abstract class Sort {
//	메서드
	public abstract void sort(int[] arr);
//		이런 형태로 sort 해라...
//		규격만 정해줌=사용법
		
	public void swap(int[] a, int i1, int i2) {	
		int temp;
		temp = a[i1];
		a[i1] = a[i2];
		a[i2] = temp;
	}		//스왑은 두번 사용하기 때문에 부모에 배치하는게 좋다.
}