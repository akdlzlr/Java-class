package edu.iot.jdbc_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

import edu.iot.common.util.FileUtil;
import edu.iot.jdbc_test.model.FamousSaying;

public class JsonToArray {
	public static void main(String[] args) {
		try {
			String json = FileUtil.readResource("/famoussaying.json");
			
			Gson gson = new Gson();
			
//			배열로 복원
			FamousSaying[] arr= gson.fromJson(json, FamousSaying[].class);
			System.out.println(Arrays.toString(arr));

//			리스트로 복원
			System.out.println("==========================");
			List<FamousSaying> list = new ArrayList<FamousSaying>(Arrays.asList(arr));
			for(FamousSaying s : list) {
				System.out.println(s);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
