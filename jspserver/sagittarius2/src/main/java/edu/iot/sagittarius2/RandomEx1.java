package edu.iot.sagittarius2;

import java.util.List;

import edu.iot.sagittarius2.dao.Top100Dao;
import edu.iot.sagittarius2.dao.Top100DaoImpl;
import edu.iot.sagittarius2.model.Top100;

public class RandomEx1 {
	public static void main(String[] args) {
		Top100Dao dao = new Top100DaoImpl();
		
		try {
			List<Top100> list = dao.random(5);
			list.forEach(System.out::println);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
