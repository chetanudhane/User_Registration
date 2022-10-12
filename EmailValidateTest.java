package regex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EmailValidateTest {

	private final Email emailId = new Email();

	@ParameterizedTest
	@ValueSource(strings = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
			"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com", "abc",
			".abc@.com.my", "abc123@gmail.a", ".abc123@.com", ".abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com",
			"abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com.", "abc@abc@gmail.com", "abc@gmail.com.1a",
			"abc@gmail.com.aa.au" })
	public void checkMultipleMails(String email) {
		Assertions.assertTrue(emailId.isValid(email));
		System.out.println(emailId.isValid(email) + "  : " + email);
	}

	@ParameterizedTest
	@ValueSource(strings = { "abc", ".abc@.com.my", "abc123@gmail.a", ".abc123@.com", ".abc123@.com.com",
			".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc.@gmail.com.", "abc@gmail.com.1a" })

	public void checkMultipleMailsFalse(String email) {
		Assertions.assertFalse(emailId.isValid(email));
		System.out.println(emailId.isValid(email) + " : " + email);
	}

}
