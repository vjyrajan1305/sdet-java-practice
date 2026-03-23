package week2_day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Problems {

	public static void main(String[] args) {

		ArrayList<String> testLogs = new ArrayList<>(Arrays.asList("Chrome|TC01_Login|PASS", "Firefox|TC01_Login|FAIL",
				"Chrome|TC02_Search|PASS", "Edge|TC02_Search|PASS", "Firefox|TC03_Checkout|FAIL",
				"Chrome|TC03_Checkout|PASS", "Edge|TC01_Login|PASS"));

		HashSet<String> uniqueBrowsers = new HashSet<>();
		HashSet<String> uniqueTestCases = new HashSet<>();
		ArrayList<String> failures = new ArrayList<>();
		for (String log : testLogs) {
			String[] parts = log.split("\\|");
			String browser = parts[0];
			String testCase = parts[1];
			String result = parts[2];
			uniqueBrowsers.add(browser);
			uniqueTestCases.add(testCase);
			if (result.equals("FAIL")) {
				failures.add(browser + "->" + testCase);
			}
		}

		System.out.println("Unique Browser: " + uniqueBrowsers);
		System.out.println("Unique Testcase: " + uniqueTestCases);
		System.out.println("Failed Testcase: " + failures);
	}
}