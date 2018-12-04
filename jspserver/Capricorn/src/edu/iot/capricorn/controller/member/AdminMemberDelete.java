package edu.iot.capricorn.controller.member;

import java.io.Console;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.iot.capricorn.Context;
import edu.iot.capricorn.service.MemberService;

/**
 * Servlet implementation class AdminMemberDelete
 */
@WebServlet("/admin/member/delete")
public class AdminMemberDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	MemberService service = Context.get(MemberService.class);
	
	public AdminMemberDelete() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		
		try {
			service.delete(userId);
//			String url = request.getContextPath()+"/admin/member/list";
//			response.sendRedirect(url);
			
			response.sendRedirect("list");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
