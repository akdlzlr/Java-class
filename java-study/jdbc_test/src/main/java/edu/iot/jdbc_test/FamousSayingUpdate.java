package edu.iot.jdbc_test;

import java.util.List;

import edu.iot.common.ui.Prompt;
import edu.iot.jdbc_test.dao.FamousSayingDaoImpl;
import edu.iot.jdbc_test.model.FamousSaying;

public class FamousSayingUpdate {
	public static void main(String[] args) {
		FamousSayingDaoImpl dao = new FamousSayingDaoImpl();
		try {
			List<FamousSaying> list = dao.getList();
			for(FamousSaying s : list) {
				System.out.println(s);
			}
			int count = dao.count();
			System.out.println("총 "+count+"건");
			
//			ID로 검색하기
			Prompt prompt = new Prompt();
			long id = prompt.getInt("수정할 ID");
			FamousSaying fs = dao.findById(id);
			System.out.println(fs);
			
//			수정할 내용 입력 받아 반영
			String statement = prompt.getString("문구").trim();
			String who = prompt.getString("이름").trim();
			
			if(!statement.isEmpty()) {
				fs.setStatement(statement);
			}
			
			if(!who.isEmpty()) {
				fs.setWho(who);
			}
			
//			Dao로 수정
			dao.update(fs);
			
//			수정 내용 확인
			fs = dao.findById(fs.getId());
			System.out.println(fs);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
