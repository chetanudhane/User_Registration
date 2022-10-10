package regex;

public class UserRegistration {

	public static void main(String[] args) {

		ValidationOperations validation = new ValidationOperations();
		validation.validateDetails();
		validation.validateMobileNumber();
		validation.validatePassword();
	}
}
