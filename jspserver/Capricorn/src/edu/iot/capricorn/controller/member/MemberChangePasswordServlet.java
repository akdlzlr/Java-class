package edu.iot.capricorn.controller.member;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.iot.capricorn.Context;
import edu.iot.capricorn.controller.BasicServlet;
import edu.iot.capricorn.model.Member;
import edu.iot.capricorn.model.ModelAndView;
import edu.iot.capricorn.service.MemberService;
import edu.iot.capricorn.util.Property;
@WebServlet("/member/change_password")
public class MemberChangePasswordServlet extends BasicServlet {

	MemberService service=Context.get(MemberService.class);
	
	@Override
	protected void get(ModelAndView mav, HttpServletRequest request, HttpServletResponse response) throws Exception {
		mav.setView("/member/change_password.jsp");
	}
	
	@Override
	protected void post(ModelAndView mav, HttpServletRequest request, HttpServletResponse response) throws Exception {

		String oldPassword = request.getParameter("password");
		String newPassword = request.getParameter("newPassword");
		
		Member member = (Member)request.getSession().getAttribute("USER");
		int result = service.changePassword(member,oldPassword,newPassword);
		
		if(result==1) {
			mav.setView("redirect:view");
		}else {
			mav.addAttribute("error","비밀번호가 일치하지 않습니다.");
			mav.setView("/member/change_password.jsp");
		}
	}
}
