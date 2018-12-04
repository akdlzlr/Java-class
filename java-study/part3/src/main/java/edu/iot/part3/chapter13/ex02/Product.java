package edu.iot.part3.chapter13.ex02;

import lombok.Data;

@Data		// lombok 라이브러리 이용한것
public class Product<T,M> {
	
	private T kind;
	private M model;
	
}