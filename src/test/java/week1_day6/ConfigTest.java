package week1_day6;

// Exactly how ConfigReader works in real Selenium frameworks
class FrameworkConfig {
	private static String browserName = "chrome";
	private static String baseUrl = "www.google.com";
	private static int implicitWait = 10;

	public static String getBrowserName() {
		return browserName;
	}

	public static String getBaseUrl() {
		return baseUrl;
	}

	public static int getImplicitWait() {
		return implicitWait;
	}

	public static void setBrowserName(String browserName) {
		if (browserName.equals("chrome") || browserName.equals("safari")) {
			FrameworkConfig.browserName = browserName;
			System.out.println("Browser set to: " + browserName);
		} else {
			System.out.println("Unsupported browser: " + browserName);
		}
	}

	public static void displayConfig() {
		System.out.println("=== Framework Configuration ===");
		System.out.println("Browser: " + browserName);
		System.out.println("Base URL: " + baseUrl);
		System.out.println("Implicit Wait: " + implicitWait + "s");
	}

}

public class ConfigTest {
	public static void main(String[] args) {
		FrameworkConfig.displayConfig();

		System.out.println("----------------------------------");

		FrameworkConfig.setBrowserName("firefox"); // unsupported
		FrameworkConfig.setBrowserName("safari"); //  valid
	//	FrameworkConfig.browserName="hack"; // ❌ private — cannot tamper
	}
}
