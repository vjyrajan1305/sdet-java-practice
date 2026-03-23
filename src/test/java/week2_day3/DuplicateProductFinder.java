package week2_day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class DuplicateProductFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> searchResults = new ArrayList<>();
		searchResults.add("Blue Top");
		searchResults.add("Men Tshirt");
		searchResults.add("Blue Top"); // duplicate
		searchResults.add("Winter Top");
		searchResults.add("Men Tshirt"); // duplicate
		searchResults.add("Stylish Dress");
		searchResults.add("Winter Top"); // duplicate

		System.out.println("Total searched products: " + searchResults.size());

		HashSet<String> obj = new HashSet<String>();

		ArrayList<String> dup = new ArrayList<String>();

		for (String test : searchResults) {
			if (!obj.add(test)) {
				dup.add(test);
			}
		}
		System.out.println("\nDuplicate check passed: " + (dup.isEmpty() ? "No Duplicates" : "Duplicates found"));
		System.out.println("\nDuplicates: " + dup);

		HashSet<String> obj2 = new HashSet<String>(searchResults);
		System.out.println("Unique: " + obj2);

		ArrayList<String> sorted = new ArrayList<String>(obj2);

		Collections.sort(sorted);

		System.out.println("\nFinal Sorted products: " + sorted);
		
		 

	}

}
