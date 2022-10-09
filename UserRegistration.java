package regex;

import java.util.Scanner;

public class UserRegistration {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String regex = "^[A-Z][a-z]{3,}$";
		System.out.println("Enter First Name...");
		String firstName = sc.next();
		System.out.println("Enter Last Name...");
		String lastName = sc.next();
		System.out.println("Enter Mail Id...");
		String emailId = sc.next();
		System.out.println("Enter Mobile Number...");
		String mobileNumber = sc.next();

		boolean fName, lName;
		boolean email, mobile;

		fName = firstName.matches(regex);
		lName = lastName.matches(regex);
		email = emailId.matches("^[A-Za-z0-9+_.-]+@(bl+.+co+.+)$");
		mobile = mobileNumber.matches("^(0|91)[6-9][\\d]{9}");

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
		if (mobile) {
			System.out.println("Mobile Number : " + mobileNumber);

		} else {
			System.out.println("Invalid Type Of Mobile Number...");
		}

	}
}
