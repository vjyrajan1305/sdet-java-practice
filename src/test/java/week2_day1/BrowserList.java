package week2_day1;

import java.util.ArrayList;

//ArrayList
public class BrowserList {
	public static void main(String[] args) {
		ArrayList<String> browsers = new ArrayList<String>();
		// add browsers
		browsers.add("Chrome");
		browsers.add("Safari");
		browsers.add(0, "Edge");
		System.out.println("All browsers" + browsers);
		System.out.println("Total browsers: " + browsers.size());
		System.out.println("First browser: " + browsers.getFirst());
		System.out.println("Last Browser: " + browsers.get(browsers.size() - 1));
		System.out.println("Has Chrome: " + browsers.contains("Chrome"));
		// remove Chrome
		browsers.remove("Chrome");
		System.out.println("After remove: " + browsers);
		// loop — run test for each browser
		System.out.println("\nRunning test on each browser: ");
		for (String browser : browsers) {
			System.out.println("Launching: "+browser);
		}
	}

}
