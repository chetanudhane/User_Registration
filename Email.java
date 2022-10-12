package regex;

import java.util.regex.Pattern;

public class Email {

	public boolean isValid(String email) {
		String regex = "^[a-zA-Z0-9][a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9]+.+[a-zA-Z]{2}+$";
		Boolean mail = Pattern.matches(regex, email);
		if (mail) {
			return true;

		} else {
			return false;

		}
	}

}
