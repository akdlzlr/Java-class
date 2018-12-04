package edu.iot.sagittarius;

import edu.iot.common.ui.Prompt;
import edu.iot.sagittarius.dao.MemberDao;
import edu.iot.sagittarius.dao.MemberDaoImpl;
import edu.iot.sagittarius.model.Member;

public class MyBatisEx3 {
	public static void main(String[] args) {
		MemberDao dao = new MemberDaoImpl();
		Prompt prompt = new Prompt();
		try {
			String userId = prompt.getString("사용자 ID").trim();
			Member admin = dao.findById(userId);
			if(admin !=null) {
				// 사용자로부터 변경 정보 입력
//				admin.setAddress("서울시 강남구");
				String str = prompt.getString("수정할 정보").trim();
				admin.setAddress(str);
				// 비밀번호 입력
				String pw=prompt.getString("비밀번호").trim();
				admin.setPassword(pw);	// 입력받은 pw와 데이터베이스에 있는 pw를
										//	update 실행시(where 절에서) 검사함.
				
				int count=dao.update(admin);
				if(count==1) {
					System.out.println("수정완료");
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
				
				
				
//				if(admin.getPassword().equals(pw)) { //	문자열은 equals로 검사.
//					admin.setAddress(str);
//					int count = dao.update(admin);
//					System.out.println("수정 "+count+"건");
//				}else {
//					System.out.println("수정 실패");
//				}
					
			}else {
				System.out.println(userId+"이 없습니다");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}	
