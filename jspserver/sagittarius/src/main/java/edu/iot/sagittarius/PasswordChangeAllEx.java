package edu.iot.sagittarius;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.iot.common.sec.SHA256Util;
import edu.iot.common.ui.Prompt;
import edu.iot.sagittarius.dao.MemberDao;
import edu.iot.sagittarius.dao.MemberDaoImpl;
import edu.iot.sagittarius.model.Member;

public class PasswordChangeAllEx {
	public static void main(String[] args) {
		MemberDao dao = new MemberDaoImpl();
		Prompt pr = new Prompt();

		try {
			List<Member> list = dao.getList();
			for(Member m : list) {
				changePassword(dao,m);
			}
			list.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void changePassword(MemberDao dao, Member m) throws Exception{
		String pw =m.getPassword();
		String salt = SHA256Util.generateSalt();
		String encPw = SHA256Util.getEncrypt(pw, salt);
		System.out.println(encPw);
		Map<String, String> map = new HashMap<>();
		
		map.put("userId", m.getUserId());
		map.put("salt", salt);
		map.put("oldPassword", pw);
		map.put("newPassword", encPw);
		
		int result = dao.changePassword(map);
		if(result==1) {
			System.out.println("변경 완료");
		}else {
			System.out.println("변경 실패");
		}
	}
}