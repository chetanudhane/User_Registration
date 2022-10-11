package regex;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UserValidationTest {

	UserValidation userValidation = new UserValidation();

	@Test
	public void givenFirstName_WhenProperShouldReturnTrue() {
		Assert.assertEquals(true, userValidation.validateFirstName("Chetan"));
	}

	@Test
	public void givenFirstName_WhenProperShouldReturnFalse() {
		Assert.assertEquals(false, userValidation.validateFirstName("chetan"));
	}

	@Test
	public void givenLastName_WhenProperShouldReturnTrue() {
		Assert.assertEquals(true, userValidation.validateLastName("Udhane"));
	}

	@Test
	public void givenLastName_WhenProperShouldReturnFalse() {
		Assert.assertEquals(false, userValidation.validateLastName("udhane"));
	}

	@Test
	public void givenEmail_WhenProperShouldReturnTrue() {
		Assert.assertEquals(true, userValidation.validateEmailId("udhane22@gmail.co"));
	}

	@Test
	public void givenEmail_WhenProperShouldReturnFalse() {
		Assert.assertEquals(false, userValidation.validateEmailId("Udhane22@gmail12.co.in"));
	}

	@Test
	public void givenMobileNumber_WhenProperShouldReturnTrue() {
		Assert.assertEquals(true, userValidation.validateMobileNumber("91 9685741425"));
	}

	@Test
	public void givenMobileNumber_WhenProperShouldReturnFalse() {
		Assert.assertEquals(false, userValidation.validateMobileNumber("919685741425"));
	}

	@Test
	public void givenPassword_WhenProperShouldReturnTrue() {
		Assert.assertEquals(true, userValidation.validatePassword("Chetan.1234"));
	}

	@Test
	public void givenPassword_WhenProperShouldReturnFalse() {
		Assert.assertEquals(false, userValidation.validatePassword("919685741425"));
	}

}
