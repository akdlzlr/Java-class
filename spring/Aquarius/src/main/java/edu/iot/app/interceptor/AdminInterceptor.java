package edu.iot.app.interceptor;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;


@Component
public class AdminInterceptor extends BaseInterceptor{

	@Override
	public String check(HttpServletRequest request) {
		if(!isAdmin(request)) {
			return "사용자 권한이 올바르지 않습니다.";
		}
		
		return null;
	}
}
