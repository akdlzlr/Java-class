package edu.iot.part3.chapter15.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		
//		ArrayList로 배열을 만들어 add매서드로 객체 넣기
		List<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("jdbc");
		list.add("servlet/jsp");
		list.add(2,"database");
		list.add("ibatis");
		
		int size = list.size();
		System.out.println("총 갯수 : " + size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println(" 2번은 ? "+ skill);
		System.out.println();
		
		for(int i =0; i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("ibatis");
		
		for(int i = 0; i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
		
//		asList의 함수로 배열 선언과 데이터값 넣어서 한번에 만들기
		List<String> list1 = Arrays.asList("홍길동","신용권","김자바");
		for(String name : list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1,2,3	);
		for (int num : list2) {
			System.out.println(num);
		}
	}
}
