package edu.iot.app;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.iot.common.service.ResortService;
import edu.iot.common.service.RestaurantService;
import edu.iot.common.service.TourService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	/*
	 * @Autowired TourDao dao;
	 */
	@Autowired
	RestaurantService restaurantService;

	@Autowired
	ResortService resortService;

	@Autowired
	TourService tourService;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 * @throws Exception 
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws Exception {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);
		model.addAttribute("list", restaurantService.random(3));
		model.addAttribute("list2", resortService.random(3));
		model.addAttribute("list3", tourService.random(3));
		return "home";
	}

	/*
	 * @PostConstruct public void setup() { ArrayList<Restaurant> list = new
	 * ArrayList<>();
	 * 
	 * try { BufferedReader reastaurant = new BufferedReader(new
	 * FileReader("C:/Temp/restaurant2.txt")); String data; while ((data =
	 * reastaurant.readLine()) != null) { String[] i =data.split("\t"); if(i.length
	 * != 7) continue; System.out.println(data); Restaurant r = new Restaurant( 0,
	 * // Long.parseLong(i[0]), i[1], i[2], i[3], i[4], i[5], i[6]); list.add(r);
	 * System.out.println(r); dao.insert(r); } reastaurant.close(); } catch
	 * (Exception e) { e.printStackTrace(); } }
	 */

	/*
	 * @PostConstruct public void setup() { ArrayList<Resort> list = new
	 * ArrayList<>();
	 * 
	 * try { BufferedReader reastaurant = new BufferedReader(new
	 * FileReader("C:/Temp/resort.txt")); String data; while ((data =
	 * reastaurant.readLine()) != null) { String[] i = data.split("\t"); if
	 * (i.length != 7) continue; System.out.println(data); Resort r = new Resort(0,
	 * i[1], i[2], i[3], i[4], i[5], i[6]); list.add(r); System.out.println(r);
	 * dao.insert(r); } reastaurant.close(); } catch (Exception e) {
	 * e.printStackTrace(); } }
	 */

	/*
	 * @PostConstruct public void setup() { ArrayList<Tour> list = new
	 * ArrayList<>();
	 * 
	 * try { BufferedReader tour = new BufferedReader(new
	 * FileReader("C:/Temp/jeju.txt")); String data; while ((data = tour.readLine())
	 * != null) { String[] i = data.split("\t"); if (i.length != 7) continue;
	 * System.out.println(data); Tour r = new Tour(0, i[0], i[1], i[2], i[3], i[4],
	 * i[5],i[6]); list.add(r); System.out.println(r); dao.insert(r); }
	 * tour.close(); } catch (Exception e) { e.printStackTrace(); } }
	 */
}
