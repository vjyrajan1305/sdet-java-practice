package week2_day2;

import java.util.HashMap;
import java.util.Map.Entry;

public class TestStatusMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> testStatus = new HashMap<>();

		// record test results — testName → status
		testStatus.put("TC01_ValidLogin", "PASS");
		testStatus.put("TC02_InvalidLogin", "PASS");
	//	testStatus.put("TC03_SearchProduct", "PASS");
		testStatus.put("TC04_AddToCart", "FAIL");
		testStatus.put("TC05_Checkout", "FAIL");
		testStatus.put("TC06_RegisterUser", "PASS");
		testStatus.put("TC07_Logout", "PASS");
		// count pass and fail
		int pass = 0, fail = 0;
		for (String values : testStatus.values()) {
			if (values.equals("PASS"))
				pass++;
			else
				fail++;
		}
		System.out.println("Count of Pass: " + pass);
		System.out.println("Count of Fail: " + fail);
		 // print only failed tests
		System.out.println("\nFailed Tests:");
		for (Entry<String, String> value : testStatus.entrySet()) {
			if (value.getValue().equals("FAIL")) {
				System.out.println(value.getKey());
			}
		}
		// check specific test
		String testName = "TC03_SearchProduct";
		System.out.println("\n"+testName+": "+testStatus.getOrDefault(testName, "Not found"));
		
		String testName1 = "TC04_AddToCart";
		System.out.println("\n"+testName1+": "+testStatus.getOrDefault(testName1, "Not found"));
	}

}
