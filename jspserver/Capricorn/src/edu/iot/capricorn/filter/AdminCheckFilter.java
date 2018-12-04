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

import edu.iot.capricorn.model.Member;
import edu.iot.capricorn.model.UserLevel;

/**
 * Servlet Filter implementation class AdminCheckFilter
 */
@WebFilter("/admin/*")
public class AdminCheckFilter implements Filter {

	public AdminCheckFilter() {

	}

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

		HttpSession session = req.getSession();
		Member member = (Member) session.getAttribute("USER");

		System.out.println("관리자 필터");
		if (member != null && member.getUserLevel() == UserLevel.ADMIN) {
			chain.doFilter(request, response);
		} else {
			Map<String, Object> map = new HashMap<>();

			map.put("message", "권한이 부족해");
			map.put("destination", req.getRequestURI());

			session.setAttribute("FLASH", map);
			res.sendRedirect(req.getContextPath() + "/login");
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
