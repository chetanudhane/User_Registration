package regex;

import java.util.Scanner;

public class UserRegistration {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name...");
		String firstName = sc.next();

		boolean result;
		result = firstName.matches("^[A-Z][a-z]{3,}$");

		if (result) {
			System.out.println("Fisrt Name Is Correct...");
		} else {
			System.out.println("Invalid Type Of Name...");
		}

	}
}
