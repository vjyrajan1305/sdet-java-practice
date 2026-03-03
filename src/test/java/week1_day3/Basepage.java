package week1_day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basepage {
	WebDriver driver;
	WebDriverWait wait;

	public Basepage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	void navigateTo(String url) {
		driver.get(url);
		System.out.println("Navigate to" + url);
	}

	void sendKeys(By Locator,String text) {
		WebElement sk = wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
		sk.sendKeys(text);
	}
	
	void click(By Locator) {
		WebElement cl = wait.until(ExpectedConditions.elementToBeClickable(Locator));
		cl.click();
	}
	void closeBrowser() {
		driver.quit();
	}

}
