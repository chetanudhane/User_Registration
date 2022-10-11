package regex;

public class UserRegistration {

	public static void main(String[] args) {
		String emailId[] = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
				"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com", "abc",
				".abc@.com.my", "abc123@gmail.a", ".abc123@.com", ".abc123@.com.com", ".abc@abc.com",
				"abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com.", "abc@abc@gmail.com",
				"abc@gmail.com.1a", "abc@gmail.com.aa.au" };

		for (String string1 : emailId) {
			Boolean emailAllCheck = EmailValidation.emailValidate(string1);
			if (emailAllCheck) {
				System.out.println("Valid Email : " + string1);
			} else
				System.out.println("Invalid Email : " + string1);
		}

//		ValidationOperations validation = new ValidationOperations();
//		validation.validateDetails();
//		validation.validateMobileNumber();
//		validation.validatePassword();
	}
}
