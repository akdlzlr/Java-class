package edu.iot.sagittarius.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import edu.iot.common.dao.PaginationDaoImpl;
import edu.iot.common.database.Session;
import edu.iot.sagittarius.model.FamousSaying;

public class FamousSayingDaoImpl
		extends PaginationDaoImpl<FamousSaying, Long> 
			implements FamousSayingDao {

	public FamousSayingDaoImpl() {
		super("FamousSayingDao");
		// 이때 이름이 mapper의 namesapce와 같아야함....
	}

	@Override
	public List<FamousSaying> random(int i) throws Exception {
		try (SqlSession session = Session.getSession()) {
			return session.selectList(namespace + ".random",i);
		}
		
	}

}
