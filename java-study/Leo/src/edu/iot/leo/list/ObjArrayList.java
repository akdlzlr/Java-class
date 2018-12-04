package edu.iot.leo.list;

public class ObjArrayList<E> implements ObjList<E> {

//	필드
	final static int INTIAL_SIZE = 10; // capacity 용량
	private E[] arr;
	private int size;

	
	
//	생성자
	public ObjArrayList() {
		arr = (E[])(new Object[INTIAL_SIZE]);
		size = 0;
	}

	public ObjArrayList(int length) {
		arr = (E[])(new Object [length]);
		size = 0;
	}

	
	
//	오버라이딩 매서드
	@Override
	public void add(E obj) {
		if (size == arr.length) {
			expand(); // 배열 확장
		}
		arr[size] = obj;
		size++;
	}

////////////////////////////////////////////////////////////////////////////////////////
//	까다로운 친구들
	@Override
	public void add(int index, E obj) { // index 위치에 obj 삽입
//		인덱스가 사이즈보다 클 경우 예외처리 해야댐ㅎㅎㅎ
		if(index>size||index<0) {
			throw new ListIndexOutOfBounceException("인덱스 값 : "+index);
		}
		if (size == arr.length) {
			expand(); // 배열 확장
		}

		for (int i = size; i > index; i--) {
			arr[i] = arr[i - 1]; // 원래 있던 데이터가 밀려나는 반복문
		}

		arr[index] = obj;
		size++;
	}

	@Override
	public E remove(int index) {
//		인덱스가 사이즈보다 클 경우 예외처리 해야댐ㅎㅎㅎ
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
//		인덱스가 사이즈보다 클 경우 예외처리 해야댐ㅎㅎㅎ
		return arr[index];
	}

	@Override
	public void set(int index, E obj) {
//		인덱스가 사이즈보다 클 경우 예외처리 해야댐ㅎㅎㅎ
		arr[index] = obj;
	}

	@Override
	public void swap(int i1, int i2) {
//		인덱스가 사이즈보다 클 경우 예외처리 해야댐ㅎㅎㅎ
		if(i1>size||i1<0) {
			throw new ListIndexOutOfBounceException("인덱스1 값 : "+i1);
		}
		if(i2>size||i2<0) {
			throw new ListIndexOutOfBounceException("인덱스2 값 : "+i2);
		}
		E temp = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = temp;

	}

	@Override
	public int size() {
		return size;
	}

	
	
//	그냥 필요한 메서드
	private void expand() {
		E[] arr2 =(E[]) (new Object[2 * arr.length]);
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		arr = arr2;
	}
}