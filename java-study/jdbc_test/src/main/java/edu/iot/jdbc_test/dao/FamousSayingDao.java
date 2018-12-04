package edu.iot.jdbc_test.dao;

import java.util.List;

import edu.iot.jdbc_test.model.FamousSaying;

public interface FamousSayingDao
		extends CrudDao<FamousSaying, Long>, PaginationDao<FamousSaying>, RandomDao<FamousSaying>{

	
}