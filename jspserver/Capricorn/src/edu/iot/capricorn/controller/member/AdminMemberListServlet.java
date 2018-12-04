package edu.iot.capricorn.controller.member;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.iot.capricorn.Context;
import edu.iot.capricorn.model.Member;
import edu.iot.capricorn.service.MemberService;
import edu.iot.capricorn.util.Util;

@WebServlet("/admin/member/list")
public class AdminMemberListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	MemberService service = Context.get(MemberService.class);

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int page = Util.getInt(request.getParameter("page"), 1);

		try {
			Map<String, Object> map = service.getPage(page);
			
			request.setAttribute("today", Util.getToday());
			Util.toScope(request,map);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/admin/member/list.jsp");
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
