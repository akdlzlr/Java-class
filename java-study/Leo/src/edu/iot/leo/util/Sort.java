package edu.iot.leo.util;

public abstract class Sort {
//	�޼���
	public abstract void sort(int[] arr);
//		�̷� ���·� sort �ض�...
//		�԰ݸ� ������=����
		
	public void swap(int[] a, int i1, int i2) {	
		int temp;
		temp = a[i1];
		a[i1] = a[i2];
		a[i2] = temp;
	}		//������ �ι� ����ϱ� ������ �θ� ��ġ�ϴ°� ����.
}