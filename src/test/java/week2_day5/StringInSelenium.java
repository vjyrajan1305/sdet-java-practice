package week2_day5;

public class StringInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String actualTitle = "Automation Exercise";
		String expectedTitle = "automation exercise";
		String actualUrl = "https://automationexercise.com/login";
		String productPrice = "Rs. 500";
		String errorMessage = "  Your email or password is incorrect!  ";
		String productDetails = "Blue Top | Category: Women > Tops | Price: Rs.500";

		System.out.println("=== TC1: Verify Page Title ===");
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Title matches");
		} else {
			System.out.println("Title doesnt match");
		}

		System.out.println("\n=== TC2: Verify URL Contains Login ===");
		
		if(actualUrl.contains("login")) {
		System.out.println("Contains Login");
		}
		System.out.println("\n=== TC3: Verify URL Format ===");
		if (actualUrl.startsWith("https:")) {
			System.out.println("Correct Format");
		} else {
			System.out.println("Wrong format");
		}

		System.out.println("\n=== TC4: Extract and Verify Price ===");
		
		String replace = productPrice.replace("Rs. ", "");
		int int1 = Integer.parseInt(replace);
		if(int1 == 500) {
			System.out.println("Price matches");
		}else {
			System.out.println("Price Mismatches");
		}
		System.out.println("\n=== TC5: Verify Error Message ===");
		String trim = errorMessage.trim();
		String expectedError = "Your email or password is incorrect!";
		if(trim.equals(expectedError)) {
			System.out.println("Error matches");
		}
		System.out.println("\n=== TC6: Parse Product Details ===");
		String [] parts = productDetails.split("\\|");
		System.out.println("Product: "+parts[0]);
		System.out.println("Category: "+parts[1].replace("Category: ", ""));
		System.out.println("Price Info: "+parts[2]);
	}

}
