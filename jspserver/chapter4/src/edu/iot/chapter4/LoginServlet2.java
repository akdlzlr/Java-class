package edu.iot.chapter4;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import edu.iot.chapter4.model.Member;

@WebServlet("/login2")
public class LoginServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public LoginServlet2() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("loginForm2.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id="POLO";
		String pwd="1234";
		String name="폴로 천개 다머금";
		
		Member member = map(request);
		
		if(id.equals(request.getParameter("userId"))&&pwd.equals(request.getParameter("userPwd"))) {

			member.setName(name);
			request.getSession().setAttribute("USER", member);
			if(request.getParameter("loginCheck").equals("manager")) {
				response.sendRedirect("manager_main.jsp");
			}else {				
				response.sendRedirect("user_main.jsp");
			}
			request.removeAttribute("error");
		}
		else {
			request.setAttribute("error", "로그인 실패...");
			request.setAttribute("member", member);
			doGet(request,response);
		}
	}
	
	private Member map(HttpServletRequest request) {
		return Member.builder()
					 .userId(request.getParameter("userId"))
					 .userPwd(request.getParameter("userPwd"))
					 .loginCheck(request.getParameter("loginCheck"))
					 .build();
	}
}
