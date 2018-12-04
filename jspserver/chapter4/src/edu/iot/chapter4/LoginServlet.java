package edu.iot.chapter4;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher=request.getRequestDispatcher("loginForm.jsp");
		dispatcher.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	post는 항상 submit를 통해서 온다.
		String id = "Lee";
		String pwd="1234";
		String name="이순신";
		
		if(id.equals(request.getParameter("userid"))&&
				pwd.equals(request.getParameter("pwd"))){
			
			// 성공, url을 바꾸며 내용을 유지하는 경우
			//response.sendRedirect("main.jsp?name="+URLEncoder.encode(name,"UTF-8"));
			
			// session으로 운용하기
			HttpSession session = request.getSession();
			session.setAttribute("name", name);			
			String destination = request.getParameter("destination");
			if(destination.isEmpty()) {
				response.sendRedirect("main.jsp");			
			}else {
			session.removeAttribute("destination");
			response.sendRedirect(destination);
			}
		}
		else{
			// url을 유지하는 경우
			//response.sendRedirect("login_form.jsp");
			request.setAttribute("error", "입력이 올바르지 않습니다.");
			doGet(request,response);
		}
	}

}
