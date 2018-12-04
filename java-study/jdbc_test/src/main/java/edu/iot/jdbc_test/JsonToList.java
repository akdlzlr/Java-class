package edu.iot.jdbc_test;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import edu.iot.common.util.FileUtil;
import edu.iot.jdbc_test.model.FamousSaying;

public class JsonToList {
	public static void main(String[] args) {
		try {
			String json = FileUtil.readResource("/famoussaying.json");
			
			Gson gson = new Gson();
			
			Type collectionType=
					(new TypeToken<ArrayList<FamousSaying>>() {}).getType(); 
//			Type=java.reflect.util, TypeToken = Gson에 들어있는 객체
			List<FamousSaying> list = gson.fromJson(json, collectionType);
			System.out.println(list);
			for(FamousSaying s : list) {
				System.out.println(s);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
