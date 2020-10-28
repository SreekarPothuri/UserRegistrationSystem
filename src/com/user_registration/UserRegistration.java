package com.user_registration;

import java.util.Scanner;
import java.util.regex.*;

@FunctionalInterface
interface IUserRegistration {
	String validate();
}

public class UserRegistration {

	private static final Scanner SC = new Scanner(System.in);

	public static void main(String args[]) {
		System.out.println("*****WELCOME TO USER REGISTRATION SYSTEM*****");

		IUserRegistration firstName = () -> {
			System.out.println("First Name: ");
			String pattern = SC.next();
			if (Pattern.matches("^[A-Z]([a-z]{2,})$", pattern) == true)
				return "Valid";
			return "Invalid";
		};

		IUserRegistration lastName = () -> {
			System.out.println("Last Name: ");
			String pattern = SC.next();
			if (Pattern.matches("^[A-Z]([a-z]{2,})$", pattern) == true)
				return "Valid";
			return "Invalid";
		};

		IUserRegistration email = () -> {
			System.out.println("Email id: ");
			String pattern = SC.next();
			if (Pattern.matches("^[A-Za-z0-9]+([._%+-][0-9a-zA-Z]+)*@[A-Za-z0-9]+([.]([a-zA-Z]{2,3})*)+$",
					pattern) == true)
				return "Valid";
			return "Invalid";
		};

		IUserRegistration mobileNum = () -> {
			System.out.println("Mobile Number: ");
			String pattern = SC.next();
			if (Pattern.matches("^[0-9]{2,3}[: :]{1}[6-9]{1}[0-9]{9}$", pattern) == true)
				return "Valid";
			return "Invalid";
		};

		IUserRegistration password = () -> {
			System.out.println("Password: ");
			String pattern = SC.next();
			if (Pattern.matches("^([0-9a-zA-Z@#!]){8,}$", pattern) == true) {
				if (Pattern.matches("^([a-z0-9@#!]*)[A-Z]+([a-z0-9@#!]*)$", pattern) == true) {
					if (Pattern.matches("^([a-zA-Z@#!]*)[0-9]+([a-zA-Z@#!]*)$", pattern) == true) {
						if (Pattern.matches("^([a-zA-Z0-9]*)[@#!]{1}([a-zA-Z0-9]*)$", pattern) == true) {
							return "All Rules Matched, Login Now!!";
						}
						return "Rule 4 Not Matched";
					}
					return "Rule 3 Not Matched";
				}
				return "Rule 2 Not Matched";
			}
			return "Rule 1 Not Matched";
		};

		System.out.println(firstName.validate());
		System.out.println(lastName.validate());
		System.out.println(email.validate());
		System.out.println(mobileNum.validate());

		System.out.println("Please follow the below rules to attain a valid password");
		System.out.println("RULE-1 : Should contain minimum of 8 characters");
		System.out.println("RULE-2 : Should have atleast 1 Uppercase letter");
		System.out.println("RULE-3 : Should have atleast 1 numeric number in password");
		System.out.println("RULE-4 : Should contain exactly 1 special character");

		System.out.println(password.validate());
	}
}
