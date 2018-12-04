package edu.iot.capricorn.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

public class Util {
	
	public static int getInt(String str, int defValue) {
		int num = defValue;

		try {
			if (str != null) {
				num = Integer.parseInt(str);
			}
		} catch (Exception e) {
		}
		return num;
	}

	public static String getToday() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(new Date());
	}
	
	public static void toScope(HttpServletRequest request,Map<String,Object> map) {
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			Object value = map.get(key);
			
			request.setAttribute(key, value);
		}
	}
}
