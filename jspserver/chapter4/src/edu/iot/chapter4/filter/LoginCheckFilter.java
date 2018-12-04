package edu.iot.chapter4.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class LoginCheckFilter
 */
@WebFilter({"/main.jsp","/main2.jsp"})
public class LoginCheckFilter implements Filter {

    public LoginCheckFilter() {
        
    }

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest hsr= (HttpServletRequest) request;
		String name = (String)hsr.getSession().getAttribute("name");
		if(name==null) {
			hsr.getSession().setAttribute("destination", "main2.jsp");
			hsr.getSession().setAttribute("message","로그인이 필요한 서비스입니다.");
			((HttpServletResponse)response).sendRedirect("login");
		}
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
