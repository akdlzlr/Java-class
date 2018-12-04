package edu.iot.part3.chapter13.ex01;

import edu.iot.part3.chapter13.ex01.Box;

public class BoxEx {
	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		box1.set("홍길동");
		String name = (String) box1.get();
		
		Box<Integer> box2 = new Box<Integer>();	//	Box<int>는 허용하지않는다. 프리미티브는 안됨
		box2.set(6);
		int value = box2.get();
		System.out.println(name + " : "+value);
	}
}
