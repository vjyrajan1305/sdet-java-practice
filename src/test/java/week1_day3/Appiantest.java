package week1_day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Appiantest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		LoginPage lp = new LoginPage(driver);
		lp.login("Vijay.Govindaraj", "Test@1234");
		lp.closeBrowser();

	}

}
