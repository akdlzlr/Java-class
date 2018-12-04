package edu.iot.sagittarius2.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import edu.iot.common.dao.PaginationDaoImpl;
import edu.iot.common.database.Session;
import edu.iot.sagittarius2.model.Gallery;
import edu.iot.sagittarius2.model.Top100;

public class GalleryDaoImpl extends PaginationDaoImpl<Gallery, Long>
							implements GalleryDao{

	public GalleryDaoImpl() {
		super("GalleryDao");
	}

	@Override
	public List<Gallery> random(int i) throws Exception {
		try (SqlSession session = Session.getSession()){
			return session.selectList(namespace+".randaom",i);
		}
	}

	
}
