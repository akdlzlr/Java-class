package edu.iot.sagittarius.dao;

import edu.iot.common.dao.CrudDao;
import edu.iot.common.dao.PaginationDao;
import edu.iot.common.dao.RandomDao;
import edu.iot.sagittarius.model.FamousSaying;

public interface FamousSayingDao extends CrudDao<FamousSaying, Long>
												,PaginationDao<FamousSaying>
												,RandomDao<FamousSaying>{
	
}
