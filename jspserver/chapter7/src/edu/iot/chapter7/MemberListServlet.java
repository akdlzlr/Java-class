package edu.iot.chapter7;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.iot.chapter7.model.Member;

@WebServlet("/memberlist")
public class MemberListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MemberListServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Member> list = new ArrayList<>();
		
		for(int i=1;i<=10;i++) {
			// Member 인스턴스 생성 후 list에 추가
			list.add(new Member("이순신"+i,"신에겐 아직 "+i+"척의 배가 남아있소!",new Date()));
		}
		
		// today 만들기
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		request.setAttribute("today",sdf.format(new Date()));
		
		//	member_list.jsp로 이동하여 목록 출력
		request.setAttribute("list", list);
		RequestDispatcher dispatcher=request.
				getRequestDispatcher("member_list.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
