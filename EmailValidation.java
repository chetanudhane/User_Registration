package regex;

import java.util.regex.Pattern;

public class EmailValidation {

	static Boolean emailValidate(String string) {

		String emailMatcher = "^[a-zA-Z0-9][a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9]+.+[a-zA-Z]{2}+$";
		Boolean mail = Pattern.matches(emailMatcher, string);
		return mail;
	}

}
