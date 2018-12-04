package edu.iot.part3.chapter15.ex04;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableEx {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String,String>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.println("아이디 : ");
			String id = scanner.nextLine();
			
			System.out.println("비밀번호 : ");
			String password = scanner.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {	// id를 받아 패스워드인 값을 가져온다.
					System.out.println("로그인 성공");
					break;
				}else {
					System.out.println("비밀번호가 일치하지않습니다.");
				}
			}else {
				System.out.println("입력한 아이디가 존재하지 않음");
			}
		}
	}
}