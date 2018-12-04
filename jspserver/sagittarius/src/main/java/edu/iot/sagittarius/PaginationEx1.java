package edu.iot.sagittarius;

import java.util.List;

import edu.iot.common.ui.Prompt;
import edu.iot.sagittarius.dao.MemberDao;
import edu.iot.sagittarius.dao.MemberDaoImpl;
import edu.iot.sagittarius.model.Member;

public class PaginationEx1 {
	public static void main(String[] args) {
		MemberDao dao = new MemberDaoImpl();
		try {
			int count = dao.count();
			int totalPage=(int)Math.ceil(count/10.);
			System.out.println("페이지 : 1~"+totalPage);
			
			Prompt prompt = new Prompt();
			int page = prompt.getInt("검색 페이지");
			int start = (page-1)*10+1;
			int end = start+9;
			
			List<Member> list = dao.getPage(start, end);
			list.forEach(System.out::println);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
