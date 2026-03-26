package week2_day5;

import java.util.ArrayList;

public class StringSplitJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String csvData = "vijay@gmail.com,Pass@1234,Vijay,Rajan,Chennai,India";
		String[] fields = csvData.split(",");

		System.out.println("Email: " + fields[0]);
		System.out.println("Password: " + fields[1]);
		System.out.println("FirstName: " + fields[2]);
		System.out.println("LastName: " + fields[3]);
		System.out.println("City: " + fields[4]);
		System.out.println("Country: " + fields[5]);

		String browserConfig = "chrome|firefox|edge";
		System.out.println("\nBrowser Lists:");
		String[] brwosers = browserConfig.split("\\|");
		for (String browser : brwosers) {
			System.out.println(browser);
		}

		String url = "https://automationexercise.com/category_products/2";
		String[] urlParts = url.split("/");
		System.out.println("\nURL parts: ");
		for (String parts : urlParts) {
			if (!parts.isEmpty()) {
				System.out.println(parts);
			}
		}

		ArrayList<String> join = new ArrayList<String>();
		join.add("TC_01");
		join.add("TC_02");

		String join2 = String.join("|", join);
		System.out.println("\n"+join2);

		String base = "https://automationexercise.com";
		String path = "/api/productsList";
		String fullUrl = String.join("", base, path);
		System.out.println("\nFull API URL: " + fullUrl);
	}

}
