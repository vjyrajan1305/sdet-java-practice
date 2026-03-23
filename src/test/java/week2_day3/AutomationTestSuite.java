package week2_day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class AutomationTestSuite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println("====== automationexercise.com Test Suite ======\n");

	        // ArrayList — ordered list of test cases to run
	        ArrayList<String> testQueue = new ArrayList<>();
	        testQueue.add("TC01_RegisterUser");
	        testQueue.add("TC02_ValidLogin");
	        testQueue.add("TC03_SearchProduct");
	        testQueue.add("TC04_AddToCart");
	        testQueue.add("TC05_Checkout");
	        testQueue.add("TC06_InvalidLogin");
	        testQueue.add("TC07_Logout");

	        // HashMap — test results
	        HashMap<String, String> results = new HashMap<>();

	        // HashSet — track failed modules
	        HashSet<String> failedModules = new HashSet<>();

	        // ArrayList — execution times
	        ArrayList<Integer> execTimes = new ArrayList<>();

	        // simulate test execution
	        System.out.println("--- Running Tests ---");
	        String[] statuses = {"PASS","PASS","PASS","FAIL","PASS","PASS","PASS"};
	        String[] modules  = {"Auth","Auth","Product","Cart","Checkout","Auth","Auth"};
	        int[] times       = {320, 180, 450, 670, 890, 160, 140};

	        for (int i = 0; i < testQueue.size(); i++) {
	            String test   = testQueue.get(i);
	            String status = statuses[i];
	            String module = modules[i];
	            int time      = times[i];

	            results.put(test, status);
	            execTimes.add(time);

	            if (status.equals("FAIL")) {
	                failedModules.add(module);   // duplicates auto-removed
	            }

	            System.out.println((status.equals("PASS") ? "✅" : "❌") +
	                    " " + test + " (" + time + "ms)");
	        }

	        // summary report
	        System.out.println("\n--- SUMMARY REPORT ---");

	        // count pass/fail from HashMap
	        int pass = 0, fail = 0;
	        for (String s : results.values()) {
	            if (s.equals("PASS")) pass++; else fail++;
	        }

	        System.out.println("Total:     " + results.size());
	        System.out.println("Passed:    " + pass);
	        System.out.println("Failed:    " + fail);
	        System.out.printf("Pass Rate: %.1f%%%n", (pass * 100.0 / results.size()));

	        // execution time stats using Collections
	        System.out.println("\n--- PERFORMANCE ---");
	        System.out.println("Fastest: " + Collections.min(execTimes) + "ms");
	        System.out.println("Slowest: " + Collections.max(execTimes) + "ms");

	        Collections.sort(execTimes);
	        System.out.println("All times (sorted): " + execTimes);

	        // failed modules from HashSet
	        System.out.println("\n--- FAILED MODULES ---");
	        if (failedModules.isEmpty()) {
	            System.out.println("✅ No module failures");
	        } else {
	            for (String module : failedModules) {
	                System.out.println("❌ " + module + " module has failures");
	            }
	        }

	        // shuffle and re-run failed tests
	        ArrayList<String> failedTests = new ArrayList<>();
	        for (Map.Entry<String, String> entry : results.entrySet()) {
	            if (entry.getValue().equals("FAIL")) {
	                failedTests.add(entry.getKey());
	            }
	        }

	        System.out.println("\n--- RETRY FAILED TESTS ---");
	        System.out.println("Tests to retry: " + failedTests);
	        Collections.shuffle(failedTests);
	        System.out.println("Retry order (shuffled): " + failedTests);

	        System.out.println("\n====== Suite Complete ======");
	    }
	}