import java.util.Scanner;

/*
 * 
 * @Author Bill Wilt
 * 
 * 
 */

public class Lab7Regex {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Please enter a valid Name: ");
		String name = scnr.nextLine();
		
		validateName(name);

		scnr.close();
	}

	public static boolean validateName(String name) {

		// change this to pass ALL tests
		String regex = "[A-Z][a-z]{4}";

		if (name.matches(regex)) {
			System.out.println("Name is valid!");
			return true;
		} else {
			System.out.println("Sorry, name is not valid!");
			return false;
		} 
	}

	public static boolean validateEmail(String email) {

		// change this to pass ALL tests
		String regex = "\\w{4,}@\\w{3,10}.\\w{3}";

		if (email.matches(regex)) {
			System.out.println("Email is valid!");
			return true;
		} else {
			System.out.println("Sorry, email is not valid!");
			return false;
		}
	}
	
	public static boolean validatePhone(String phone) {

		// change this to pass ALL tests
		String regex = "\\d{3}-\\d{3}-\\d{4}";

		if (phone.matches(regex)) {
			System.out.println("Phone number is valid!");
			return true;
		} else {
			System.out.println("Sorry, phone is not valid!");
			return false;
		}
	}
	
	public static boolean validateDate(String date) {

		// change this to pass ALL tests
		String regex = "\\d{2}/\\d{2}/\\d{4}";

		if (date.matches(regex)) {
			System.out.println("Date is valid!");
			return true;
		} else {
			System.out.println("Sorry, date is not valid!");
			return false;
		}
	
		
	}
}
