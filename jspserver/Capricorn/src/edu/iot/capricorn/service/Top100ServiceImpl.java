package edu.iot.capricorn.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.iot.capricorn.Context;
import edu.iot.capricorn.dao.Top100Dao;
import edu.iot.capricorn.model.Top100;

public class Top100ServiceImpl implements Top100Service {

	Top100Dao dao = Context.get(Top100Dao.class);

	@Override
	public List<Top100> random(int num) throws Exception {
		List<Top100> list = dao.random(num);

		for (Top100 item : list) {
			List<String> imageList = new ArrayList<>();
			imageList.add("11.jpg");
			imageList.add("22.jpg");
			imageList.add("33.jpg");
			imageList.add("44.jpg");
			imageList.add("55.jpg");
			imageList.add("66.jpg");
			imageList.add("77.jpg");
			imageList.add("88.jpg");
			imageList.add("99.jpg");
			imageList.add("23.jpg");
			imageList.add("24.jpg");
			Collections.shuffle(imageList);
			item.setImageList(imageList);
		}
		return dao.random(num);
	}
}





