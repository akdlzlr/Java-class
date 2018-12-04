package edu.iot.capricorn.filter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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

@WebFilter({"/member/*","/admin/*"})
public class LoginCheckFilter implements Filter {

    public LoginCheckFilter() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		HttpSession session = req.getSession();
		
		System.out.println("로그인 필터");
		if(session.getAttribute("USER")!=null) {
			chain.doFilter(request, response);			
		}else {
			Map<String, Object> map = new HashMap<>();
			
			map.put("message", "로그인이 필요해");
			map.put("destination", req.getRequestURI());
			
			session.setAttribute("FLASH", map);
						
			res.sendRedirect(req.getContextPath()+"/login");
		}
		
		
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}
}
