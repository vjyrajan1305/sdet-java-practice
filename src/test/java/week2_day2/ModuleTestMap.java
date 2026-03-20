package week2_day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ModuleTestMap {
	public static void main(String[] args) {

		HashMap<String, ArrayList<String>> suiteResults = new HashMap<>();
		// Browser → list of test results
		suiteResults.put("Chrome", new ArrayList<>(Arrays.asList("PASS", "PASS", "FAIL", "PASS")));
		suiteResults.put("Firefox", new ArrayList<>(Arrays.asList("PASS", "FAIL", "FAIL")));
		suiteResults.put("Edge", new ArrayList<>(Arrays.asList("PASS", "PASS", "PASS", "PASS")));

		String topbrowser = "";
		double high = 0;

		for (String browser : suiteResults.keySet()) {
			ArrayList<String> value = suiteResults.get(browser);
			double passcount = 0;
			for (String result : value) {
				if (result.equals("PASS")) {
					passcount++;
				}

			}
			double passPercentage = (passcount * 100.0) / value.size();
			System.out.printf("%s : %.2f%%%n", browser, passPercentage);

			if (passPercentage > high) {
				high = passPercentage;
				topbrowser = browser;
			}
		}
		System.out.println(topbrowser+" : "+ high);

	}
}
