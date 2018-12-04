package edu.iot.common.service;

import java.util.List;
import java.util.Map;

import edu.iot.common.model.Restaurant;
import edu.iot.common.model.Search;
import edu.iot.common.model.Tour;

public interface TourService {
	Map<String, Object> getPage(int page) throws Exception;
	public Tour findById(long tourId) throws Exception;
	List<Tour> search(Search search) throws Exception;
	List<Tour> random(int num) throws Exception;
}
