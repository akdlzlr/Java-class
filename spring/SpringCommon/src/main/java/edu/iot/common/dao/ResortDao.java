package edu.iot.common.dao;

import java.util.List;

import edu.iot.common.model.Resort;
import edu.iot.common.model.Search;

public interface ResortDao extends CrudDao<Resort,Long>, RandomDao<Resort> {
	List<Resort> search(Search search) throws Exception;
}
