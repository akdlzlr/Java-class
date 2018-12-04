package edu.iot.part3.chapter13.ex04;

public interface Storage<T> {
	public void add(T item, int index);
	
	public T get(int index);
}
