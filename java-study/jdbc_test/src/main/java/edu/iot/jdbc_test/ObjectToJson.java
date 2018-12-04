package edu.iot.jdbc_test;

import com.google.gson.Gson;

import edu.iot.jdbc_test.model.FamousSaying;

public class ObjectToJson {
	// 주로 전송할 때 쓰임
	public static void main(String[] args) {
		try {
			
			Gson gson = new Gson();
			FamousSaying fs = new FamousSaying(1,"모르는게 약이다.","속담");
			System.out.println(fs);
			String json = gson.toJson(fs);		// 전송될 문자열
			System.out.println(json);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
