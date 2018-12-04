package edu.iot.capricorn.dao;

import java.util.Map;
import edu.iot.capricorn.model.Member;
import edu.iot.common.dao.CrudDao;
import edu.iot.common.dao.PaginationDao;


public interface MemberDao extends CrudDao<Member, String>{
	
	int changePassword(Map<String, String> map) throws Exception;
}
