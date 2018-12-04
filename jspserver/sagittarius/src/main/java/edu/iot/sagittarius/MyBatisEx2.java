package edu.iot.sagittarius;

import edu.iot.common.sec.SHA256Util;
import edu.iot.sagittarius.dao.MemberDao;
import edu.iot.sagittarius.dao.MemberDaoImpl;
import edu.iot.sagittarius.model.Member;
import edu.iot.sagittarius.model.UserLevel;

public class MyBatisEx2 {
	public static void main(String[] args) {
//		Admin 계정 추가
		String pw = "1234";
		String salt = SHA256Util.generateSalt();
		String encPw	= SHA256Util.getEncrypt(pw, salt);
		
		Member admin = Member.builder()
							 .userId("admin")
							 .password(encPw)
							 .salt(salt)
							 .name("관리자")
							 .userLevel(UserLevel.ADMIN)
							 .phoneNumber("010-1234-5678")
							 .nickName("Admin")
							 .email("admin@edu.iot")
							 .address("")
							 .build();
		MemberDao dao = new MemberDaoImpl();
		try {
			int count = dao.insert(admin);
			System.out.printf("추가 %d 건\n",count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
