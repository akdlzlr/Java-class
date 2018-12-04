package edu.iot.capricorn.dao;

import java.util.Map;
import org.apache.ibatis.session.SqlSession;
import edu.iot.capricorn.model.Member;
import edu.iot.common.dao.CrudDaoImpl;
import edu.iot.common.database.Session;


public class MemberDaoImpl extends CrudDaoImpl<Member, String> 
								implements MemberDao {

	public MemberDaoImpl() {
		super("MemberDao");
		// TODO Auto-generated constructor stub
	}

	@Override
	public int changePassword(Map<String, String> map) throws Exception {
		try (SqlSession session=Session.getSession()){
			int count = session.update(namespace+".changePassword",map);
			session.commit();
			return count;
		}
	}
}
