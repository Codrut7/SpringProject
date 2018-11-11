package com.cinemaProject.cinemaproject.util.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClientValidator {
	/**
	 * Match characters are -> A-z, 0-9 , _ , - . Length between 3-15
	 */
	private static final String USERNAME_PATTERN = "^[A-z0-9_-]{3,15}$";
	/**
	 * Match charaters are -> ( A-Z , 0-9, . , _ , % , + , - )  the @ sign for email  (A-Z, 0-9,., -)																					
	 */
	private static final String EMAIL_PATTERN = "^[A-z0-9._%+-]+@[A-z0-9.-]+\\.[A-z]{2,6}$";
	/**
	 * Match characters 0-9 . Only with the length 10
	 */
	private static final String CELLPHONE_PATTERN = "^[0-9]{10}";
	
	/**
	 	^                 # start-of-string
		(?=.*[0-9])       # a digit must occur at least once
		(?=.*[a-z])       # a lower case letter must occur at least once
		(?=.*[A-Z])       # an upper case letter must occur at least once
		(?=.*[@#!$%^&+=])  # a special character must occur at least once
		(?=\S+$)          # no whitespace allowed in the entire string
		.{8,}             # anything, at least eight places though
		$                 # end-of-string
	*/
	
	private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$!%^&+=])(?=\\S+$).{8,}$";
	
	public static boolean UsernameValidator(String username) {
		Pattern pattern = Pattern.compile(USERNAME_PATTERN);
		Matcher matcher = pattern.matcher(username);
		return matcher.matches();
	}

	public static boolean EmailValidator(String email) {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
	
	public static boolean CellphoneValidator(String cellphone) {
		Pattern pattern = Pattern.compile(CELLPHONE_PATTERN);
		Matcher matcher = pattern.matcher(cellphone);
		return matcher.matches();
	}
	
	public static boolean PasswordValidator(String password) {
		Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}
	
}
