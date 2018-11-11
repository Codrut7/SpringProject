package com.cinemaproject.test.UtilTest.validatorsTest;

/**
 * The test validates the email regex -> ^[A-z0-9._%+-]+@[A-z0-9.-]+\\.[A-z]{2,6}$

 * Any alpha-numerical character and and the special characters {._$%+-} then @ then alpha-numerical characters then . then any alpha characters.
 * For the site zone, the length must be between 2 and 6 characters.
 * @author cordu
 *
 */

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.cinemaProject.cinemaproject.util.validators.ClientValidator;

public class EmailValidatorTest {

	@Test
	public void testEmail() {
		String validEmail = "mihai@yahoo.com";
		String validEmail2 = "ceva@gmail.com";
		String validEmail3 = "altceva@ceva.dadada";
		String validEmail4 = "2mail@email.fdfd";
		String invalidEmail = "numere@numere"; // nu are .domeniu
		String invalidEmail2 = "cevaceva.com"; // nu are @
		String invalidEmail3 = "mihai@yahoo.comcomcom"; // . domeniul este prea lung

		assertTrue(ClientValidator.EmailValidator(validEmail));
		assertTrue(ClientValidator.EmailValidator(validEmail2));
		assertTrue(ClientValidator.EmailValidator(validEmail3));
		assertTrue(ClientValidator.EmailValidator(validEmail4));

		assertFalse(ClientValidator.EmailValidator(invalidEmail));
		assertFalse(ClientValidator.EmailValidator(invalidEmail2));
		assertFalse(ClientValidator.EmailValidator(invalidEmail3));
	}
}
