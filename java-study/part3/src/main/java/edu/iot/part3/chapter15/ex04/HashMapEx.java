package edu.iot.part3.chapter15.ex04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
//		맵 컬렉션 생성
		Map<String, Integer> map = new HashMap<String,Integer>();
//										HashMap<키타입, 값 타입>
//		객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 98);
		System.out.println("총 Entry 수 :  "+map.size());
		
//		객체찾기	
		System.out.println("\t홍길동 : "+map.get("홍길동"));
		System.out.println();
		
//		객체를 하나씩 처리
		Set<String> KeySet = map.keySet();
		Iterator<String> keyIterator = KeySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t"+key+" : "+value);
		}
		System.out.println();
		
//		객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수 : "+map.size());
		
//		객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String,Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+key+" : "+value);
		}
		System.out.println();
		
//		객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수 : "+map.size());
		
	}
}
