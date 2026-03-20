package week2_day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Problems {

	public static void main(String[] args) {
		ArrayList<String> testCases = new ArrayList<>(Arrays.asList("TC01_LoginPage_Smoke", "TC02_LoginPage_Regression",
				"TC03_CartPage_Smoke", "TC04_PaymentPage_Regression", "TC05_CartPage_Smoke"));

		
		LinkedHashMap<String, ArrayList<String>> map = new LinkedHashMap<String, ArrayList<String>>();
		
		for(String test:testCases) {
			
			String[] parts = test.split("_");
			
			String pageName = parts[1];
			
			if (!map.containsKey(pageName)) {
                map.put(pageName, new ArrayList<>());
            }

            // add the full test case name into that page's list
            map.get(pageName).add(test);
	        }
		for (Entry<String, ArrayList<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
		}
		
		
	
	} 
