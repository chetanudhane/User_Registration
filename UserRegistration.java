package regex;

import java.util.Scanner;

public class UserRegistration {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name...");
		String firstName = sc.next();
		System.out.println("Enter Last Name...");
		String lastName = sc.next();

		boolean fName;
		boolean lName;

		fName = firstName.matches("^[A-Z][a-z]{3,}$");
		lName = lastName.matches("^[A-Z][a-z]{3,}$");

		if (fName && lName) {
			System.out.println("Fisrt Name : " + firstName + "\nLast Name : " + lastName);

		} else {
			System.out.println("Invalid Type Of Name...");
		}

	}
}
