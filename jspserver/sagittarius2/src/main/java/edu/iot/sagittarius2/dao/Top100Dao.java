package edu.iot.sagittarius2.dao;

import edu.iot.common.dao.CrudDao;
import edu.iot.common.dao.PaginationDao;
import edu.iot.common.dao.RandomDao;
import edu.iot.sagittarius2.model.Top100;

public interface Top100Dao extends CrudDao<Top100, Long>,
							PaginationDao<Top100>,
							RandomDao<Top100>{

}
