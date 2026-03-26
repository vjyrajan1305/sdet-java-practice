package week2_day5;

public class StringBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pageTitle = "  Automation Exercise - All Products  ";
        String url = "https://automationexercise.com/products";
        String browser = "CHROME";

        System.out.println("=== Basic Info ===");
        System.out.println("Length: "+pageTitle.length());
        System.out.println("Trimmed: "+pageTitle.trim());
        System.out.println("Upper: "+pageTitle.toUpperCase());
        System.out.println("Lower: "+pageTitle.toLowerCase());
        
        System.out.println("\n=== Search ===");
        System.out.println("Contains 'Products': "+pageTitle.contains("Products"));
        System.out.println("URL starts with https: " +url.startsWith("https:"));
        System.out.println("URL ends with products: " +url.endsWith("products"));
        System.out.println("Index of 'Exercise': " +pageTitle.indexOf("E"));
        
        System.out.println("\n=== Comparison ===");
        System.out.println("equals: "+browser.equals("chrome"));
        System.out.println("equalsIgnoreCase: " +browser.equalsIgnoreCase("ChRoMe"));
        
        System.out.println("\n=== Extraction ===");
        System.out.println("Substring: "+ pageTitle.substring(2, 12) );
        System.out.println("Last path: " + url.substring(url.lastIndexOf("/")+1));
        System.out.println("Char at: "+browser.charAt(4));
	}

}
