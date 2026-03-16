package week1_day7;

abstract class BasePage implements Browsable {
protected String browserName;
protected String currentUrl;
protected static final String BASE_URL = "https://automationexercise.com";

BasePage(String browserName){
	this.browserName = browserName;
}

@Override
public void openBrowser(String browserName) {
	 System.out.println("[" + browserName + "] Browser opened");	
}

@Override
public void closeBrowser() {
	 System.out.println("[" + browserName + "] Browser closed");	
}

@Override
public void navigateTo(String url) {
	System.out.println("[" + browserName + "] Navigated to: " + url);	
}
public void clickElement(String element) {
    System.out.println("[" + browserName + "] Clicked: " + element);
}

public void typeText(String field, String text) {
    System.out.println("[" + browserName + "] Typed '" + text + "' in: " + field);
}

public void verifyText(String text) {
    System.out.println("[" + browserName + "] Verified text: '" + text + "' ✅");
}

public void waitForElement(String element) {
    System.out.println("[" + browserName + "] Waiting for: " + element);
}

public void scrollDown() {
    System.out.println("[" + browserName + "] Scrolled down to footer");
}

// Abstract — every page must define these
abstract String getPageName();
abstract void verifyPageLoaded();
}

