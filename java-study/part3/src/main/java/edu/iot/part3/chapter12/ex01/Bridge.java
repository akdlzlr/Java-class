package edu.iot.part3.chapter12.ex01;

public class Bridge {
//	Bridge는 공유객체이다
//	기사들이 스레드이다.
//	기사는 상속으로 정의한다.
	private int counter = 0;
	private String name = "아무개";
	private String address="모름";
	
	
//	스레드들이 across를 공유한다. 이때 생기는 문제를 해결하기 위해서
//	lock을 걸어준다.
//	synchronized -> 동기화 매서드
//	재진입(reentrance) 불가
	public synchronized void across(String name, String address) {
		this.counter++;
		this.name=name;
		this.address=address;
		check();
		
	}
	
	public synchronized String toString() {
//		기사 스레드가 계속 덮어 쓰고 있음
		return "이름 : "+name+", 출신 : "+address+", 도전 횟수"+counter;
	}
	
	public void check() {
		if(name.charAt(0)!=address.charAt(0)) {
			System.out.println("문제 발생!!!!!!!!"+toString());
		}
	}
}
