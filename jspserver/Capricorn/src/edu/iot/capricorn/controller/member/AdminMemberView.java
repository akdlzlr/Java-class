package edu.iot.capricorn.controller.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.iot.capricorn.Context;
import edu.iot.capricorn.model.Member;
import edu.iot.capricorn.service.MemberService;

@WebServlet("/admin/member/view")
public class AdminMemberView extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	MemberService service = Context.get(MemberService.class);
	
    public AdminMemberView() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId=request.getParameter("userId");
		Member member = null;
		try {
			member = service.findById(userId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		request.setAttribute("member", member);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/admin/member/view.jsp");
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
