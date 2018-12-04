package edu.iot.sagittarius2.dao;

import edu.iot.common.dao.CrudDao;
import edu.iot.common.dao.PaginationDao;
import edu.iot.common.dao.RandomDao;
import edu.iot.sagittarius2.model.Gallery;

public interface GalleryDao extends 
				PaginationDao<Gallery>, RandomDao<Gallery>,
										CrudDao<Gallery, Long> {

}
