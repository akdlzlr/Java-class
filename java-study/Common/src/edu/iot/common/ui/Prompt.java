package edu.iot.common.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Prompt {
	Scanner scanner;
	
	public Prompt() {
		scanner = new Scanner(System.in);
	}
	
	public String getString(String prompt) {
		System.out.println(prompt + ": ");
		return scanner.nextLine();
	}
	
	public int getInt(String prompt) {
		String str = getString(prompt);
		return Integer.parseInt(str);
	}
	
	public Date getDate(String prompt) throws ParseException{
		String str = getString(prompt + "(yyyy-MM-dd)");
		if(str.equals("")) {
			return new Date();
		}
		SimpleDateFormat sdf = new SimpleDateFormat("(yyyy-MM-dd)");
		return sdf.parse(str);
	}
	
	public Date getDate(String prompt, String pattern) throws ParseException {
		String str = getString(prompt + "(" + pattern + ")");
		if(str.equals("")) {
			return new Date();	// 오늘 날짜
		}
		
		SimpleDateFormat sdf = 
				new SimpleDateFormat(pattern);
		return sdf.parse(str);
	}
	
	public int selectList(String prompt, List<String> list) {
		System.out.println("\t목\t록");
		//	list 목록 출력
		for(int i=0; i<list.size(); i++) {
			System.out.printf("%d] %s\n",i,list.get(i));
		}
		System.out.println();
		
		//	 사용자 인덱스 입력 받아 리턴
		
		return getInt(prompt);
	}
	
	public String getLines(String prompt) {
		System.out.println(prompt+" : ");
		StringBuilder builder = new StringBuilder();
		while(true) {
			String str = scanner.nextLine();
			if(str.equalsIgnoreCase("end")) {
				break;
			}
			builder.append(str+"\r\n");
		}
		return builder.toString();
	}
}
