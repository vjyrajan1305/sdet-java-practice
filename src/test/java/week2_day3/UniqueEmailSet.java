package week2_day3;

import java.util.Collections;
import java.util.HashSet;

public class UniqueEmailSet {

	public static void main(String[] args) {
		
		HashSet<String> registeredEmails = new HashSet<String>();
		
		String [] attempts = {
	            "vijay@gmail.com",
	            "rajan@gmail.com",
	            "vijay@gmail.com",      // duplicate attempt
	            "kumar@gmail.com",
	            "rajan@gmail.com",      // duplicate attempt
	            "admin@gmail.com"};
		
		for (String email : attempts) {
			boolean hasemail = registeredEmails.add(email);
			
			if (hasemail) {
				System.out.println("Registered Users: "+email);
			}
			else {
				System.out.println("Duplicate Users: "+email);
			}
		}
		System.out.println("\nTotal Registered Users: "+registeredEmails.size());
		System.out.println("All Users: "+registeredEmails);
		
		System.out.println("\nIs Registered User contains vjy@gmail.com = "+registeredEmails.contains("vjy@gmail.com"));
		System.out.println("\nIs Registered User contains vijay@gmail.com = "+registeredEmails.contains("vijay@gmail.com"));
	}

}
