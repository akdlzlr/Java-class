package edu.iot.jdbc_test;

import java.util.List;

import edu.iot.common.ui.Prompt;
import edu.iot.jdbc_test.dao.FamousSayingDao;
import edu.iot.jdbc_test.dao.FamousSayingDaoImpl;
import edu.iot.jdbc_test.model.FamousSaying;

public class RandomEx {
	public static void main(String[] args) {
		FamousSayingDao dao = new FamousSayingDaoImpl();
		
		try {
			Prompt prompt = new Prompt();
			int i = prompt.getInt("명언 갯수");
			List<FamousSaying> list = dao.random(i);
			list.forEach(t->System.out.println(t));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
