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

		boolean fName;
		boolean lName, email;

		fName = firstName.matches(regex);
		lName = lastName.matches(regex);
		email = emailId.matches("^[A-Za-z0-9+_.-]+@(bl+.+co+.+)$");
		if (email) {
			System.out.println("Mail Id : " + emailId);

		} else {
			System.out.println("Invalid Type Of Mail ID...");
		}

		if (fName && lName) {
			System.out.println("Fisrt Name : " + firstName + "\nLast Name : " + lastName);

		} else {
			System.out.println("Invalid Type Of Name...");
		}

	}
}
