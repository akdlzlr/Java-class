package edu.iot.jdbc_test;

import com.google.gson.Gson;

import edu.iot.common.util.FileUtil;
import edu.iot.jdbc_test.model.FamousSaying;

public class JsonToObject {
	public static void main(String[] args) {
		try {
			String json = FileUtil.readResource("/famoussaying2.json");
												// 상대주소?를 절대주소로?
			
			Gson gson = new Gson();
			
//			단일 객체 복원
			FamousSaying fs = gson.fromJson(json, FamousSaying.class);
			
			System.out.println(fs);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
