package edu.iot.sagittarius2.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import edu.iot.common.dao.PaginationDaoImpl;
import edu.iot.common.database.Session;
import edu.iot.sagittarius2.model.Top100;

public class Top100DaoImpl extends PaginationDaoImpl<Top100, Long>
			implements Top100Dao {

	public Top100DaoImpl() {
		super("Top100Dao");
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Top100> random(int i) throws Exception {
		try (SqlSession session = Session.getSession()) {
			return session.selectList(namespace + ".random",i);
		}
	}

}
