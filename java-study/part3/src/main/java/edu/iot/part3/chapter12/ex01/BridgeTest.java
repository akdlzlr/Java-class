package edu.iot.part3.chapter12.ex01;

public class BridgeTest {
	public static void main(String[] args) {
//		main 스레드가 다른 스레드 보다 제일 먼저 종료된다.
		
		System.out.println("시뮬레이션을 시작한다.");
		Bridge bridge = new Bridge();
		new Knight(bridge,"홍길동","홍천").start();
		new Knight(bridge,"임꺽정","임실").start();
		new Knight(bridge,"일지매","일산").start();
		new Knight(bridge,"장보고","장흥").start();
		new Knight(bridge,"이순신","이천").start();
		
	}
}
