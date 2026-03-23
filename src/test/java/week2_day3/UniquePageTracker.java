package week2_day3;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class UniquePageTracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> visitedPage = new LinkedHashSet<String>();
		ArrayList<String> navigationFlow = new ArrayList<>();
		navigationFlow.add("https://automationexercise.com");
		navigationFlow.add("https://automationexercise.com/products");
		navigationFlow.add("https://automationexercise.com/login");
		navigationFlow.add("https://automationexercise.com/products"); // revisit
		navigationFlow.add("https://automationexercise.com/view_cart");
		navigationFlow.add("https://automationexercise.com/login"); // revisit
		navigationFlow.add("https://automationexercise.com/checkout");

		System.out.println("===== PAGE NAVIGATION TRACKER =====\n");
		System.out.println("Total navigation steps: " + navigationFlow.size());

		for (String page : navigationFlow) {
			visitedPage.add(page);
		}
		System.out.println("\nUnique pages visited:");
		for (String unique : visitedPage) {
			System.out.println("  -  " + unique);
		}

		String[] criticalPages = { "https://automationexercise.com/login", "https://automationexercise.com/checkout",
				"https://automationexercise.com/payment" };
		for (String page : criticalPages) {
			if (visitedPage.contains(page)) {
				System.out.println("\nVisited Critical pages: " + page);
			} else {
				System.out.println("\nNot Visited Critical pages: " + page);
			}
		}

	}
}
