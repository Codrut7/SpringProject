package com.cinemaproject.test.UtilTest.validatorsTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.cinemaProject.cinemaproject.util.validators.ClientValidator;

/**
 * The test validates the password regex -> "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$!%^&+=])(?=\\S+$).{8,}$"
 * At least a number, at least a lowercase-letter, an uppercase-letter and a special character from the list (@#$!%^&+=).
 * No white spaces . Min length is 8.
 * 
 * @author cordu
 *
 */

public class PasswordValidatorTest {
	@Test
	public void passwordTest() {
		String validPassword = "Merge123!";
		String validPassword2 = "Andrei1!#";
		String validPassword3 = "Miha3######";
		String validPassword4 = "123Andrei123$#@";
		String invalidPassword = "Andrei1"; // nu contine caracter special. lungimea e 7
		String invalidPassword2 = ";;;;;;"; // e varza
		String invalidPassword3 = "abc@@#####"; // nu contine caracter uppercase
		String invalidPassword4 = "123123123123"; // nu contine alpha caracter
		
		assertTrue(ClientValidator.PasswordValidator(validPassword));
		assertTrue(ClientValidator.PasswordValidator(validPassword2));
		assertTrue(ClientValidator.PasswordValidator(validPassword3));
		assertTrue(ClientValidator.PasswordValidator(validPassword4));
		
		assertFalse(ClientValidator.PasswordValidator(invalidPassword));
		assertFalse(ClientValidator.PasswordValidator(invalidPassword2));
		assertFalse(ClientValidator.PasswordValidator(invalidPassword3));
		assertFalse(ClientValidator.PasswordValidator(invalidPassword4));
		
	}
}
