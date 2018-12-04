package edu.iot.sagittarius;

import edu.iot.common.sec.SHA256Util;
import edu.iot.common.ui.Prompt;
import edu.iot.sagittarius.dao.MemberDao;
import edu.iot.sagittarius.dao.MemberDaoImpl;
import edu.iot.sagittarius.model.Member;

public class LoginTest {
	public static void main(String[] args) {
		
		MemberDao dao = new MemberDaoImpl();
		Prompt pr = new Prompt();
		
		try {
			String id = pr.getString("사용자 id 입력").trim();
			String pw = pr.getString("비밀번호 입력").trim();
			Member user = dao.findById(id);
			if(user !=null) {
				String salt =user.getSalt();
				String encPw = SHA256Util.getEncrypt(pw, salt);
				
				if(user.getPassword().equals(encPw)) {
					System.out.println("로그인 성공!");
					System.out.println("사용자 이름 : "+user.getName());
					System.out.println("사용자 레벨 : "+user.getUserLevel());
					System.out.println("갱신 날짜 : "+user.getUpdateDate());
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}else {
				System.out.println("존재하지 않는 사용자이름 입니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
