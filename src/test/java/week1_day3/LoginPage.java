package week1_day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends Basepage {
	By usernamefield = By.xpath("//input[@placeholder='Username']");
	By passwordfield = By.xpath("//input[@placeholder='Password']");
	By Loginbutton = By.xpath("//input[@id='jsLoginButton']");

	LoginPage(WebDriver driver) {
		super(driver);
	}

	void login(String username, String password) {
		navigateTo("https://vuramdemo.appiancloud.com/suite/");
		sendKeys(usernamefield, username);
		sendKeys(passwordfield, password);
		click(Loginbutton);
		navigateTo("https://vuramdemo.appiancloud.com/suite/sites/brd-process/page/home");
		System.out.println("Login attempted for: "+username);
	}

}
