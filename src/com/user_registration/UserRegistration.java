package com.user_registration;

import java.util.Scanner;
import java.util.regex.*;

@FunctionalInterface
interface IUserRegistration {
	void validate(String pattern, String details);
}

public class UserRegistration {

	private static final Scanner SC = new Scanner(System.in);
	public static final String NAME_PATTERN = "^[A-Z]([a-z]{2,})$";
	public static final String EMAIL_PATTERN = "^[A-Za-z0-9]+([._%+-][0-9a-zA-Z]+)*@[A-Za-z0-9]+([.]([a-zA-Z]{2,3})*)+$";
	public static final String MOBILENUM_PATTERN = "^[0-9]{2,3}[: :]{1}[6-9]{1}[0-9]{9}$";
	public static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]*[@$!%&]([A-Za-z\\d]*){8,}$";

	static IUserRegistration Obj = (pattern, details) -> {
		if (Pattern.matches(pattern, details) == true) {
			System.out.println("VALID");
		} else {
			System.out.println("INVALID");
		}
	};

	public static void main(String args[]) {
		System.out.println("*****WELCOME TO USER REGISTRATION SYSTEM*****");

		System.out.println("First Name:");
		String fname = SC.next();
		Obj.validate(NAME_PATTERN, fname);

		System.out.println("Last Name:");
		String lname = SC.next();
		Obj.validate(NAME_PATTERN, lname);

		System.out.println("Email:");
		String email = SC.next();
		Obj.validate(EMAIL_PATTERN, email);

		System.out.println("Mobile Number:");
		String mobileNum = SC.next();
		Obj.validate(MOBILENUM_PATTERN, mobileNum);

		System.out.println("Please follow the below rules to attain a valid password");
		System.out.println("RULE-1 : Should contain minimum of 8 characters");
		System.out.println("RULE-2 : Should have atleast 1 Uppercase letter");
		System.out.println("RULE-3 : Should have atleast 1 numeric number in password");
		System.out.println("RULE-4 : Should contain exactly 1 special character");

		System.out.println("Password:");
		String password = SC.next();
		Obj.validate(PASSWORD_PATTERN, password);
	}
}
