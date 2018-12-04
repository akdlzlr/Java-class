package edu.iot.part3.chapter15.ex03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("jdbc");
		set.add("servlet/jsp");
		set.add("java");			// java는 동일한 객체이므로 한번만 저장된다.
		set.add("ibatis");
		
		int size = set.size();
		System.out.println("총 객체수 : "+size);
		
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+element);
		}
		
		System.out.println();
		
		set.remove("jdbc");
		set.remove("ibatis");
		
		System.out.println("총 객체수 : "+set.size());
		
		iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+element);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어있당");
		}
		
		Set<Member> set1 = new HashSet<Member>();
		
		set1.add(new Member("홍길동",30));
		set1.add(new Member("홍길동",30));
		
		System.out.println("총 객체수 : "+ set1.size());
	}
}