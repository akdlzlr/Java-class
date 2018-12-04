package edu.iot.sagittarius;

import java.util.HashMap;
import java.util.Map;

import edu.iot.common.sec.SHA256Util;
import edu.iot.common.ui.Prompt;
import edu.iot.sagittarius.dao.MemberDao;
import edu.iot.sagittarius.dao.MemberDaoImpl;
import edu.iot.sagittarius.model.Member;

public class PasswordChangeEx {
	public static void main(String[] args) {
		MemberDao dao = new MemberDaoImpl();
		Prompt pr = new Prompt();

		try {
			String id = pr.getString("ID를 입력하시오 ").trim();
			Member user = dao.findById(id);
			if (user != null) {
				String opw = pr.getString("비밀번호를 입력하시오 ").trim();
				String salt = user.getSalt();
				String encopw = SHA256Util.getEncrypt(opw, salt);
				if (user.getPassword().equals(encopw)) {
					String npw = pr.getString("새 비밀번호를 입력하시오 ").trim();
					if (npw.equals(pr.getString("다시한번 입력하시오 "))) {
						System.out.println("새 비밀 번호가 일치합니다.");
						Map<String, String> map = new HashMap<>();
						String encnpw = SHA256Util.getEncrypt(npw, salt);
						map.put("userId", id);
						map.put("oldPassword", encopw);
						map.put("newPassword", encnpw);
						map.put("salt",salt);
						int result = dao.changePassword(map);
						if (result == 1) {
							System.out.println("변경 완료");
						} else {
							System.out.println("변경 실패");
						}
					} else {
						System.out.println("새 비밀번호가 일치하지 않습니다.");
					}
				}else {
					System.out.println("비밀번호가 일치 하지 않습니다.");
				}
			} else {
				System.out.println("없는 아이디 입니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}