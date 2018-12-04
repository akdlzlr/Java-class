package edu.iot.jdbc_test;

import java.util.List;
import java.util.function.Consumer;

import edu.iot.common.ui.Prompt;
import edu.iot.jdbc_test.dao.FamousSayingDao;
import edu.iot.jdbc_test.dao.FamousSayingDaoImpl;
import edu.iot.jdbc_test.model.FamousSaying;

public class PaginationEx {
	public static void main(String[] args) {
		FamousSayingDao dao = new FamousSayingDaoImpl();
		
		try {
			int count = dao.count();
			int totalPage=(int)Math.ceil(count/10.);
			System.out.println("페이지 : 1~"+totalPage);
			
			Prompt prompt = new Prompt();
			int page = prompt.getInt("검색 페이지");
			int start = (page-1)*10+1;
			int end = start+9;
			
			List<FamousSaying> list = dao.getPage(start, end);
			list.forEach(System.out::println);
			
			/* forEach 정석
			list.forEach(new Consumer<FamousSaying>() {
				@Override
				public void accept(FamousSaying t) {
					System.out.println(t);
				}
			});
			*/
//			forEach 람다식
//			list.forEach(t->System.out.println(t));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Database.close();
	}
}
