<<<<<<< HEAD
package main.java.com.junitUserRegistrationSystem;

import java.util.regex.Pattern;

import main.java.com.customexceptions.*;

@FunctionalInterface
interface IUserRegistration {
	boolean validate(String pattern, String details);
}

public class UserRegistration {

	public static final String NAME_PATTERN = "^[A-Z]([a-z]{2,})$";
	public static final String EMAIL_PATTERN = "^[A-Za-z0-9]+([._%+-][0-9a-zA-Z]+)*@[A-Za-z0-9]+([.]([a-zA-Z]{2,3})*)+$";
	public static final String MOBILENUM_PATTERN = "^[0-9]{2,3}[: :]{1}[6-9]{1}[0-9]{9}$";
	public static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]*[@$!%&]([A-Za-z\\d]*){8,}$";

	static IUserRegistration Obj = (detailsPattern, details) -> {
		return (Pattern.matches(detailsPattern, details));
	};

	public static boolean firstName(String firstName) throws InvalidUserDetailsException {
		if (Obj.validate(NAME_PATTERN, firstName)) {
			return true;
		} else {
			throw new InvalidUserDetailsException("Enter valid user details");
		}
	}

	public static boolean lastName(String lastName) throws InvalidUserDetailsException {
		if (Obj.validate(NAME_PATTERN, lastName)) {
			return true;
		} else {
			throw new InvalidUserDetailsException("Enter valid user details");
		}
	}

	public static boolean email(String mail) throws InvalidUserDetailsException {
		if (Obj.validate(EMAIL_PATTERN, mail)) {
			return true;
		} else {
			throw new InvalidUserDetailsException("Enter valid user details");
		}
	}

	public static boolean mobileNum(String mNum) throws InvalidUserDetailsException {
		if (Obj.validate(MOBILENUM_PATTERN, mNum)) {
			return true;
		} else {
			throw new InvalidUserDetailsException("Enter valid user details");
		}
	}

	public static boolean password(String password) throws InvalidUserDetailsException {
		if (Obj.validate(PASSWORD_PATTERN, password)) {
			return true;
		}else {
		throw new InvalidUserDetailsException("Enter valid user details");
		}
	}
}
=======
package main.java.com.junitUserRegistrationSystem;

import java.util.regex.Pattern;

import main.java.com.customexceptions.*;

@FunctionalInterface
interface IUserRegistration {
	boolean validate(String pattern, String details);
}

public class UserRegistration {

	public static final String NAME_PATTERN = "^[A-Z]([a-z]{2,})$";
	public static final String EMAIL_PATTERN = "^[A-Za-z0-9]+([._%+-][0-9a-zA-Z]+)*@[A-Za-z0-9]+([.]([a-zA-Z]{2,3})*)+$";
	public static final String MOBILENUM_PATTERN = "^[0-9]{2,3}[: :]{1}[6-9]{1}[0-9]{9}$";
	public static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]*[@$!%&]([A-Za-z\\d]*){8,}$";

	static IUserRegistration Obj = (detailsPattern, details) -> {
		return (Pattern.matches(detailsPattern, details));
	};

	public static boolean firstName(String firstName) throws InvalidUserDetailsException {
		if (Obj.validate(NAME_PATTERN, firstName)) {
			return true;
		} else {
			throw new InvalidUserDetailsException("Enter valid user details");
		}
	}

	public static boolean lastName(String lastName) throws InvalidUserDetailsException {
		if (Obj.validate(NAME_PATTERN, lastName)) {
			return true;
		} else {
			throw new InvalidUserDetailsException("Enter valid user details");
		}
	}

	public static boolean email(String mail) throws InvalidUserDetailsException {
		if (Obj.validate(EMAIL_PATTERN, mail)) {
			return true;
		} else {
			throw new InvalidUserDetailsException("Enter valid user details");
		}
	}

	public static boolean mobileNum(String mNum) throws InvalidUserDetailsException {
		if (Obj.validate(MOBILENUM_PATTERN, mNum)) {
			return true;
		} else {
			throw new InvalidUserDetailsException("Enter valid user details");
		}
	}

	public static boolean password(String password) throws InvalidUserDetailsException {
		if (Obj.validate(PASSWORD_PATTERN, password)) {
			return true;
		}else {
		throw new InvalidUserDetailsException("Enter valid user details");
		}
	}
}
>>>>>>> 381495968fdaae8f54b2be4cf05561ef430cafa9
