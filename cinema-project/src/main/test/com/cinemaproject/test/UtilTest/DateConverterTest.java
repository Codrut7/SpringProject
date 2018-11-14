package com.cinemaproject.test.UtilTest;
	/**
	 * The DateConverter method expects only a String of the following format -> (yyyy-MM-dd hh:mm:ss.SSS)
	 * The following test class wil exemplify that .
	 * @author cordu
	 *
	 */

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.cinemaProject.cinemaproject.util.DateConverter;
public class DateConverterTest {
	@Test
	public void converterTest() {
		String correctDate = "11/14/2018 11:49 PM";
		String correctDate2 = "11/16/2018 12:00 PM";
		String correctDate3 = "12/12/2018 4:00 AM";
		String invalidDate = "12/12/2012 3:00 AM";
		String invalidDate2 = "2087-100-25a 1a6:4a0:30.aa0aa";
		String invalidDate3 = "xfasdeffgs";
		
		assertNotNull(DateConverter.convert(correctDate));
		assertNotNull(DateConverter.convert(correctDate2));
		assertNotNull(DateConverter.convert(correctDate3));
		assertNull(DateConverter.convert(invalidDate));
		assertNull(DateConverter.convert(invalidDate2));
		assertNull(DateConverter.convert(invalidDate3));
	}
}
