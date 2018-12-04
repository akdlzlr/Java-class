package edu.iot.jdbc_test;

import java.util.List;

import edu.iot.common.ui.Prompt;
import edu.iot.jdbc_test.dao.FamousSayingDaoImpl;
import edu.iot.jdbc_test.model.FamousSaying;

public class FamousSayingRead {
	public static void main(String[] args) {
		FamousSayingDaoImpl dao = new FamousSayingDaoImpl();
		
		List<FamousSaying> list;
		try {
			int count = dao.count();
			list = dao.getList();
			System.out.printf("총 %d건\n",count);
			for (FamousSaying s : list) {
				System.out.println(s);
			}
			Prompt prompt = new Prompt();
			long id = prompt.getInt("id 입력");
			System.out.println(dao.findById(id));
		} catch (Exception e) {
			e.printStackTrace();
		}
		Database.close();
	}
}
