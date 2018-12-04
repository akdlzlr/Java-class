package edu.iot.leo.list;

public class ObjArrayList<E> implements ObjList<E> {

//	�ʵ�
	final static int INTIAL_SIZE = 10; // capacity �뷮
	private E[] arr;
	private int size;

	
	
//	������
	public ObjArrayList() {
		arr = (E[])(new Object[INTIAL_SIZE]);
		size = 0;
	}

	public ObjArrayList(int length) {
		arr = (E[])(new Object [length]);
		size = 0;
	}

	
	
//	�������̵� �ż���
	@Override
	public void add(E obj) {
		if (size == arr.length) {
			expand(); // �迭 Ȯ��
		}
		arr[size] = obj;
		size++;
	}

////////////////////////////////////////////////////////////////////////////////////////
//	��ٷο� ģ����
	@Override
	public void add(int index, E obj) { // index ��ġ�� obj ����
//		�ε����� ������� Ŭ ��� ����ó�� �ؾߴ菉����
		if(index>size||index<0) {
			throw new ListIndexOutOfBounceException("�ε��� �� : "+index);
		}
		if (size == arr.length) {
			expand(); // �迭 Ȯ��
		}

		for (int i = size; i > index; i--) {
			arr[i] = arr[i - 1]; // ���� �ִ� �����Ͱ� �з����� �ݺ���
		}

		arr[index] = obj;
		size++;
	}

	@Override
	public E remove(int index) {
//		�ε����� ������� Ŭ ��� ����ó�� �ؾߴ菉����
		E obj = arr[index];
		int i;
		for (i = index; i < size - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[i] = null;
		size--;
		return obj;
	}
///////////////////////////////////////////////////////////////////////////////////////
	@Override
	public E get(int index) {
//		�ε����� ������� Ŭ ��� ����ó�� �ؾߴ菉����
		return arr[index];
	}

	@Override
	public void set(int index, E obj) {
//		�ε����� ������� Ŭ ��� ����ó�� �ؾߴ菉����
		arr[index] = obj;
	}

	@Override
	public void swap(int i1, int i2) {
//		�ε����� ������� Ŭ ��� ����ó�� �ؾߴ菉����
		if(i1>size||i1<0) {
			throw new ListIndexOutOfBounceException("�ε���1 �� : "+i1);
		}
		if(i2>size||i2<0) {
			throw new ListIndexOutOfBounceException("�ε���2 �� : "+i2);
		}
		E temp = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = temp;

	}

	@Override
	public int size() {
		return size;
	}

	
	
//	�׳� �ʿ��� �޼���
	private void expand() {
		E[] arr2 =(E[]) (new Object[2 * arr.length]);
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		arr = arr2;
	}
}