package edu.iot.part3.chapter18.ex05;

import java.io.Serializable;

public class ClassA implements Serializable{
	
	/**
	 * java doc 주석
	 */ 
	private static final long serialVersionUID = 1L;
//	뒤에 숫자는 필드 값이 변경될 때 바꿔주면 된다. 버전이 같으면 저장하지 않고 실행해도 됨

	int field1;
	ClassB field2 = new ClassB();
	static int field3;
	transient int field4;
//	예제 버전이 같으면 필드 값이 변해도 변하지 않음
	int field5;	
//	필드 값을 추가하거나 삭제했을 때 버전을 바꿔줘야함
	@Override
	public String toString() {
		return "ClassA [field1=" + field1 + ", field2=" + field2 + "]";
	}
}