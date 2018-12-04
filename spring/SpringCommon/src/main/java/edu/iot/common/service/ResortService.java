package edu.iot.common.service;

import java.util.List;
import java.util.Map;

import edu.iot.common.model.Resort;
import edu.iot.common.model.Restaurant;
import edu.iot.common.model.Search;

public interface ResortService {
	Map<String, Object> getPage(int page) throws Exception;
	public Resort findById(long resortId) throws Exception;
	List<Resort> search(Search search) throws Exception;
	List<Resort> random(int num) throws Exception;
}
