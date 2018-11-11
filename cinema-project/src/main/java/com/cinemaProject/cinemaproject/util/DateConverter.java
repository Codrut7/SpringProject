package com.cinemaProject.cinemaproject.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {
	/**
	 * Conver the String to Timestamp date format . If valid, compare it to the present time and return it only if it is in the future .
	 * @param time
	 * @return
	 */
	public static Timestamp convert(String time) {
		try {
		    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		    Date parsedDate = dateFormat.parse(time);
		    Timestamp timestamp = new Timestamp(parsedDate.getTime());
		    Timestamp presentTime = new Timestamp(System.currentTimeMillis());
		    if(timestamp.before(presentTime)) {
		    	return null;
		    }else {
		    	return timestamp;
		    }
		} catch(Exception e) { 
		   return null;
		}
	}
}
