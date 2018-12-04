package edu.iot.capricorn.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import edu.iot.capricorn.model.Top100;
import edu.iot.common.dao.CrudDaoImpl;
import edu.iot.common.database.Session;

public class Top100DaoImpl extends CrudDaoImpl<Top100, Long>
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
