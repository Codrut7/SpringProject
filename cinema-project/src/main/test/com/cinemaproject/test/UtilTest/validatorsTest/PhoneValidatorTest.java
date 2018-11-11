package com.cinemaproject.test.UtilTest.validatorsTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.cinemaProject.cinemaproject.util.validators.ClientValidator;

/**
 * The test validates the phone regex -> "^[0-9]{10}" 
 * Can contain any number and must the fixed length of 10.
 * 
 * @author cordu
 *
 */
public class PhoneValidatorTest {
	@Test
	public void cellphoneTest() {
		String validNumber = "0745723932";
		String validNumber2 = "1234567890";
		String validNumber3 = "0000000000";
		String invalidNumber = "074572393"; // length is 9
		String invalidNumber2 = "0724a30423"; // contains a letter
		String invalidNumber3 = "##07459212"; // contains a special character
		
		assertTrue(ClientValidator.CellphoneValidator(validNumber));
		assertTrue(ClientValidator.CellphoneValidator(validNumber2));
		assertTrue(ClientValidator.CellphoneValidator(validNumber3));
		assertFalse(ClientValidator.CellphoneValidator(invalidNumber));
		assertFalse(ClientValidator.CellphoneValidator(invalidNumber2));
		assertFalse(ClientValidator.CellphoneValidator(invalidNumber3));
		
	}
}
