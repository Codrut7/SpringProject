package com.cinemaproject.test.UtilTest.validatorsTest;
	/**
	 * The test validates the Username regex  ->   ^[A-z0-9_-]{3,15}$ 
	 * The username can contain any alpha-numeric characters and the - _ special characters. The length must be between 3-15 characters.
	 * @author cordu
	 *
	 */

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.cinemaProject.cinemaproject.util.validators.ClientValidator;

public class UsernameValidatorTest {
	
	@Test
	public void usernameTest() {
		String validUsername1 = "Andrei123";
		String validUsername2 = "Miha_14";
		String validUsername3 = "---_";
		String invalidUsername1 = "IT"; // length too small
		String invalidUsername2 = "Andrei!"; // has ! character
		String invalidUsername3 = "Mihai##"; // has # character 
		
		assertTrue(ClientValidator.UsernameValidator(validUsername1));
		assertTrue(ClientValidator.UsernameValidator(validUsername2));
		assertTrue(ClientValidator.UsernameValidator(validUsername3));
		assertFalse(ClientValidator.UsernameValidator(invalidUsername1));
		assertFalse(ClientValidator.UsernameValidator(invalidUsername2));
		assertFalse(ClientValidator.UsernameValidator(invalidUsername3));
	}
}
