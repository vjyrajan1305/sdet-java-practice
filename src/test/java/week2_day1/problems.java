package week2_day1;

import java.util.ArrayList;

public class problems {

	public static void main(String[] args) {

		ArrayList<String> given = new ArrayList<String>();
		/*
		 * if(!given.contains("Selenium")) { given.add("Selenium"); }
		 * if(!given.contains("Java")) { given.add("Java"); }
		 * if(!given.contains("Selenium")) { given.add("Selenium"); }
		 * if(!given.contains("TestNG")) { given.add("TestNG"); }
		 */
		// Remove Duplicates
		String[] items = {"Blue Top", "Red Top", "Blue Top", "Jeans", "Top White", "Jeans" };
		for (String item : items) {
			if (!given.contains(item)) {
				given.add(item);
			}
		}
		System.out.println("Total products after removing duplicates: " + given.size());
		String keyword ="Top";
		ArrayList<String> match = new ArrayList<String>();
		for (String searchResult : given) {
			if(searchResult.contains(keyword)) {
				match.add(searchResult);
			}
		}
		System.out.println("Matched products count: "+match.size());
		System.out.println( match);

	}

}
