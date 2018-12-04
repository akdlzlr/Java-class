package edu.iot.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import edu.iot.common.model.Resort;
import edu.iot.common.model.Tour;

public class FileIOStream {
	public static void main(String[] args) {

		/*
		 * ArrayList<Restaurant> list = new ArrayList<>();
		 * 
		 * try { BufferedReader reastaurant = new BufferedReader(new
		 * FileReader("C:/Temp/restaurant2.txt")); String data; while ((data =
		 * reastaurant.readLine()) != null) { String[] i =data.split("\t"); if(i.length
		 * != 7) continue; System.out.println(data); Restaurant r = new Restaurant( 0,
		 * // Long.parseLong(i[0]), i[1], i[2], i[3], i[4], i[5], i[6]); list.add(r);
		 * System.out.println(r); dao.insert(r); } reastaurant.close(); } catch
		 * (Exception e) { e.printStackTrace(); }
		 */
		
		
		/*
		 * ArrayList<Resort> list = new ArrayList<>();
		 * 
		 * try { BufferedReader reastaurant = new BufferedReader(new
		 * FileReader("C:/Temp/resort.txt")); String data; while ((data =
		 * reastaurant.readLine()) != null) { String[] i =data.split("\t"); if(i.length
		 * != 7) continue; System.out.println(data); Resort r = new Resort( 0, i[1],
		 * i[2], i[3], i[4], i[5], i[6]); list.add(r); System.out.println(r);
		 * //dao.insert(r); } reastaurant.close(); } catch (Exception e) {
		 * e.printStackTrace(); }
		 */
		
		/*ArrayList<Resort> list = new ArrayList<>();
		
		try {
			BufferedReader tour = new BufferedReader(new FileReader("C:/Temp/jeju.txt"));
			String data;
			while ((data = tour.readLine()) != null) {
				String[] i = data.split("\t");
			if (i.length != 7)
					continue;
				System.out.println(data);
				Tour r = new Tour(0, i[0], i[1], i[2], i[3], i[4], i[5],i[6]);
				list.add(r);
				System.out.println(r);
				 dao.insert(r);
			}
			tour.close();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
	}
}
