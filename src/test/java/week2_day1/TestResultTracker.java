package week2_day1;

import java.util.ArrayList;

public class TestResultTracker {

	public static void main(String[] args) {
		ArrayList<String> passedTests = new ArrayList<>();
		ArrayList<String> failedTests = new ArrayList<>();
		passedTests.add("TC-01");
		passedTests.add("TC-02");
		passedTests.add("TC-03");
		passedTests.add("TC-04");

		failedTests.add("TC-05");
		failedTests.add("TC-06");
		System.out.println("==========Test Execution Summary===========");
		int Total = passedTests.size() + failedTests.size();
		System.out.println("\nTotal TCs: " + Total);
		System.out.println("Total Passed: " + passedTests.size());
		System.out.println("Total Failed: " + failedTests.size());
		System.out.println("\nPassed Tests: ");
		for (String passed : passedTests) {
			System.out.println("✅"+passed);
		}
		System.out.println("\nFailed Tests: ");
		for (String failed : failedTests) {
			System.out.println("❌"+failed);
		}
		String searchTc = "TC-02";
		if (passedTests.contains(searchTc)) {
			System.out.println("\n"+searchTc+" -> ✅ Passed");
		}
	}

}
