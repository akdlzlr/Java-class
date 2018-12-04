package edu.iot.part3.Test01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
}
