package edu.iot.leo.list;

public interface ObjList<E> {
//	필드
	
	
//	매서드
	void add(E obj);
	void add(int index, E obj);
	E remove(int index);
	E get(int index);
	void set(int index, E obj);
	void swap(int i1, int i2);
	int size();

}