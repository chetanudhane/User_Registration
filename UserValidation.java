package regex;

import java.util.Scanner;

public class UserValidation {

	Scanner sc = new Scanner(System.in);

	public boolean validateFirstName(String firstName) {

		String regex = "^[A-Z]{1}[a-z]{2,}$";
		boolean fName;

		fName = firstName.matches(regex);

		if (fName) {
			return true;

		} else {
			return false;
		}
	}

	public boolean validateLastName(String lastName) {

		String regex = "^[A-Z]{1}[a-z]{2,}$";
		boolean lName;

		lName = lastName.matches(regex);

		if (lName) {
			return true;

		} else {
			return false;
		}
	}

	public boolean validateEmailId(String mailId) {
		boolean email;

		email = mailId.matches("^[a-z0-9_!#$%&’*+=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");

		if (email) {
			return true;

		} else {
			return false;

		}
	}

	public boolean validateMobileNumber(String mobileNumber) {
		boolean mobile = mobileNumber.matches("^(0|91)[\\s][6-9][\\d]{9}");

		if (mobile) {
			return true;

		} else {
			return false;

		}
	}

	public boolean validatePassword(String password) {
		boolean pass = password.matches("(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=.-])[A-Za-z0-9].{8,}$");

		if (pass) {
			return true;

		} else {
			return false;

		}
	}
}
