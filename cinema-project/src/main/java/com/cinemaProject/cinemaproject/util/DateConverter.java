package com.cinemaProject.cinemaproject.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateConverter {
	/**
	 * Convert the String to Timestamp date format . If valid, compare it to the present time and return it only if it is in the future .
	 * @param time
	 * @return
	 */
	public static Timestamp convert(String time) {
		try {
			System.out.println(time);
			SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy hh:mm a", Locale.US);
			Date date = format.parse(time);
		    Timestamp timestamp = new Timestamp(date.getTime());
		    Timestamp presentTime = new Timestamp(System.currentTimeMillis());
		    if(timestamp.before(presentTime)) {
		    	System.out.println("wrong");
		    	return null;
		    }else {
		    	return timestamp;
		    }
		} catch(Exception e) { 
		   return null;
		}
	}
}
