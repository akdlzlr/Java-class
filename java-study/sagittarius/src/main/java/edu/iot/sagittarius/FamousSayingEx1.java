package edu.iot.sagittarius;

import java.util.List;

import edu.iot.common.ui.Prompt;
import edu.iot.sagittarius.dao.FamousSayingDao;
import edu.iot.sagittarius.dao.FamousSayingDaoImpl;
import edu.iot.sagittarius.model.FamousSaying;

public class FamousSayingEx1 {
	public static void main(String[] args) {
		FamousSayingDao dao = new FamousSayingDaoImpl();
//		Prompt pr = new Prompt();
		try {
			int count = dao.count();
			System.out.println(count);
//			int total = (int)Math.ceil(count/10.);
//			System.out.println("총 페이지 :"+total);
//			int page = pr.getInt("페이지 선택");
//			
//			int start = page*10+1;
//			int end = start+9;
//			
//			
			List<FamousSaying> list = dao.random(1);
//			List<FamousSaying> list = dao.getPage(start, end);
			
			
			list.forEach(System.out::println);
//			List<FamousSaying> list = dao.getList();
//			list.forEach(System.out::println);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}

