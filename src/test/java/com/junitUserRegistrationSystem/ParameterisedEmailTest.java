package test.java.com.junitUserRegistrationSystem;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.java.com.junitUserRegistrationSystem.UserRegistration;

@RunWith(Parameterized.class)
class ParameterisedEmailTest {

	private String mail;
	private boolean result;
	private UserRegistration user;
	
	@Before
	public void intialize() {
		user = new UserRegistration();
	}
	
	public ParameterisedEmailTest(String mail,boolean result) {
		this.mail = mail;
		this.result = result;
	}
	
	@Test
	public void testEmail() {
		Assert.assertTrue(result);
	}
	
	@Parameters
	public static Collection email() {
		return Arrays.asList(new Object[][] {{"abc@yahoo.com", true},{"abc-100@yahoo.com", true},{"abc.100@yahoo.com", true},{"abc111@abc.com",true},
			{"abc-100@abc.net",true},{"abc.100@abc.com.au",true},{"abc@1.com",true},{"abc@gmail.com.com",true},{"abc+100@gmail.com",true},
			{"abc",false},{"abc@.com.my",false},{"abc123@gmail.a",false},{"abc123@.com",false},{"abc123@.com.com",false},{".abc@bc.com",false},
			{"abc()*@gmail.com",false},{"abc@%*.com",false},{"abc..2002@gmail.com",false},{"abc.@gmail.com",false},{"abc@abc@gmail.com",false},
			{"abc@gmail.com.1a",false},{"abc@gmail.com.aa.u",false}});
	}
}
