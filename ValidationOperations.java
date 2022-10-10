package regex;

import java.util.Scanner;

public class ValidationOperations {

	Scanner sc = new Scanner(System.in);

	public void validateMobileNumber() {
		System.out.println("Enter Mobile Number...");
		String mobileNumber = sc.nextLine();

		boolean mobile;
		mobile = mobileNumber.matches("^(0|91)[\\s][6-9][\\d]{9}");
		if (mobile) {
			System.out.println("Mobile Number : " + mobileNumber);

		} else {
			System.out.println("Invalid Type Of Mobile Number...");
		}
	}

	public void validatePassword() {
		System.out.println("Enter Password...");
		String password = sc.next();

		boolean pass;
		pass = password.matches("(?=.*[A-Z])[A-Za-z0-9]{7,}$");
		if (pass) {
			System.out.println("Password : " + password);

		} else {
			System.out.println("Invalid Password...");
		}
	}

	public void validateDetails() {

		String regex = "^[A-Z]{1}[a-z]{2,}$";
		System.out.println("Enter First Name...");
		String firstName = sc.next();
		System.out.println("Enter Last Name...");
		String lastName = sc.next();
		System.out.println("Enter Mail Id...");
		String emailId = sc.next();

		boolean fName, lName, email;

		fName = firstName.matches(regex);
		lName = lastName.matches(regex);
		email = emailId.matches("^[A-Za-z0-9+_.-]+@(bl+.+co+.+)$");

		if (fName) {
			System.out.println("Fisrt Name : " + firstName);

		} else {
			System.out.println("Invalid Type Of First Name...");
		}
		if (lName) {
			System.out.println("Last Name : " + lastName);

		} else {
			System.out.println("Invalid Type Of Last Name...");
		}
		if (email) {
			System.out.println("Mail Id : " + emailId);

		} else {
			System.out.println("Invalid Type Of Mail Id...");
		}

	}
}
