package edu.iot.common.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.iot.common.dao.ResortDao;
import edu.iot.common.model.Pagination;
import edu.iot.common.model.Resort;
import edu.iot.common.model.Restaurant;
import edu.iot.common.model.Search;


@Service
public class ResortServiceImpl implements ResortService {
	
	@Autowired
	ResortDao dao;

	@Override
	public Map<String, Object> getPage(int page) throws Exception {
		Map<String, Object> map = new HashMap<>();

		int total = dao.count();
		Pagination pagination = new Pagination(page, total);
		map.put("pagination", pagination);
		map.put("list", dao.getPage(pagination.getPageMap()));
		return map;
	}

	@Override
	public Resort findById(long resortId) throws Exception {
		return dao.findById(resortId);
	}

	@Override
	public List<Resort> search(Search search) throws Exception {
		return dao.search(search);
	}

	@Override
	public List<Resort> random(int num) throws Exception {
		List<Resort> list = dao.random(num);

		for (Resort item : list) {
			List<String> imageList = new ArrayList<>();
			imageList.add("1.jpg");
			imageList.add("2.jpg");
			imageList.add("3.jpg");
			imageList.add("4.jpg");
			imageList.add("5.jpg");
			imageList.add("6.jpg");
			imageList.add("7.jpg");
			imageList.add("8.jpg");
			imageList.add("9.jpg");
			imageList.add("10.jpg");
			Collections.shuffle(imageList);
			item.setImageList(imageList);
		}
		return list;
	}

}
