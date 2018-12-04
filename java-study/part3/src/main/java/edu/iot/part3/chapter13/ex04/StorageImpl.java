package edu.iot.part3.chapter13.ex04;

public class StorageImpl<T> implements Storage<T> {
	private T[] array;
	public StorageImpl(int capacity) {
		this.array = (T[])(new Object[capacity]);
//		제네릭 타입은 배열은 만들수 없어서 object타입으로 만든 뒤 제네릭 타입으로 casting 해준다.
	}
	@Override
	public void add(T item, int index) {
		array[index]=item;
		
	}
	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return array[index];
	}
}
