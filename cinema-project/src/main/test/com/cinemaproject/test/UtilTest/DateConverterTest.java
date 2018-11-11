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
		String correctDate = "2018-12-25 16:40:30.0";
		String correctDate2 = "2019-01-14 200:200:200.0"; 
		String invalidDate = "2087-100-25a 1a6:4a0:30.aa0aa";
		String invalidDate2 = "xfasdeffgs";
		String invalidDate3 = "1234-1234-1234 1234:1234:1234.1234"; // actually e 1340-04-08 06:54:34
		
		assertNotNull(DateConverter.convert(correctDate));
		assertNotNull(DateConverter.convert(correctDate2));
		assertNull(DateConverter.convert(invalidDate));
		assertNull(DateConverter.convert(invalidDate2));
		// Date format-ul e corect, dar nu e o data din viitor .
		assertNull(DateConverter.convert(invalidDate3));
	}
}
