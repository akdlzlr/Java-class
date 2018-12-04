package edu.iot.sagittarius.dao;

import java.util.Map;

import edu.iot.common.dao.CrudDao;
import edu.iot.common.dao.PaginationDao;
import edu.iot.sagittarius.model.Member;

public interface MemberDao extends CrudDao<Member, String>,
									PaginationDao<Member>{
	
	int changePassword(Map<String, String> map) throws Exception;
}
