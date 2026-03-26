package week2_day5;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder report = new StringBuilder();

		report.append("====== TEST EXECUTION REPORT ======\n");
		report.append("Site: automationexercise.com\n");
		report.append("Browser: Chrome\n");
		report.append("Total Tests: 5\n");
		report.append("-----------------------------------\n");

		String[] tests = { "TC01_Login", "TC02_Search", "TC03_AddCart", "TC04_Checkout", "TC05_Logout" };
		String[] status = { "PASS", "PASS", "FAIL", "PASS", "PASS" };

		int pass = 0, fail = 0;
		for (int i = 0; i < tests.length; i++) {
			report.append(status[i].equals("PASS") ? "✅ " : "❌ ");
			report.append(tests[i]);
			report.append(" — ");
			report.append(status[i]);
			report.append("\n");

			if (status[i].equals("PASS"))
				pass++;
			else
				fail++;
		}

		report.append("-----------------------------------\n");
		report.append("Pass: ").append(pass).append("\n");
		report.append("Fail: ").append(fail).append("\n");

		double passRate = (pass * 100.0) / tests.length;
		report.append(String.format("Pass Rate: %.1f%%\n", passRate));
		report.append("====================================");

		System.out.println(report.toString());

		System.out.println("\n=== String Conversion ===");
		// int to String
		int timeout = 10;
		String timeoutStr = String.valueOf(timeout);
		System.out.println("int to String: " + timeoutStr + " (type: String)");

		// String to int
		String retryCount = "3";
		int retryInt = Integer.parseInt(retryCount);
		System.out.println("String to int: " + retryInt + " (type: int)");

		// double to String
		double price = 499.99;
		String priceStr = String.valueOf(price);
		System.out.println("double to String: " + priceStr);

		// String to double
		String amount = "1499.50";
		double amountDbl = Double.parseDouble(amount);
		System.out.println("String to double: " + amountDbl);

		// boolean to String
		boolean testPassed = true;
		String result = String.valueOf(testPassed);
		System.out.println("boolean to String: " + result);
		
		
		String testName = "TC_01";
		String browser = "Chrome";
		String error = "Not found";
		System.out.println("Test " + testName + " failed on " + browser + " with error: " + error);
		// Use String.format — clean and readable
		System.out.println(String.format("Test %s failed on %s with error: %s", testName, browser, error));
	}
}