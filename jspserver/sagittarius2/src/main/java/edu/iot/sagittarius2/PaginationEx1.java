package edu.iot.sagittarius2;

import java.util.List;

import edu.iot.common.ui.Prompt;
import edu.iot.sagittarius2.dao.Top100Dao;
import edu.iot.sagittarius2.dao.Top100DaoImpl;
import edu.iot.sagittarius2.model.Top100;

public class PaginationEx1 {
	public static void main(String[] args) {
		Top100Dao dao = new Top100DaoImpl();
		Prompt pr = new Prompt();
		
		try {
			
			System.out.println("1~"+dao.count()+" 사이의 번호를 입력하시오.");
			int start = pr.getInt("시작 번호");
			int end = pr.getInt("끝번호");
			
			
			List<Top100> list = dao.getPage(start, end);
			list.forEach(System.out::println);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
