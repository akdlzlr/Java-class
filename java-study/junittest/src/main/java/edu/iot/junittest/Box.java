package edu.iot.junittest;

public class Box <T>{
//	private Object object;
//	
//	public void  set(Object object) {
//		this.object = object;
//	}
//	
//	public Object get() {
//		return object;
//	}
	
	private T t;		// 프리미티브 타입은 사용하지 못하고 클래스로 운영해야한다. int X, Integer O
	public T get() {return t;}
	public void set(T t) {this.t=t;}
}
