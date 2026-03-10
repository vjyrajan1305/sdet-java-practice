package week1_day5;

interface Webdriver {
    void openBrowser();
    void navigateTo(String url);  // ✅ added parameter
    void quit();
}

abstract class RemoteWebDriver implements Webdriver {
    String browserName;

    public RemoteWebDriver(String browserName) {
        this.browserName = browserName;
    }

    @Override
    public void navigateTo(String url) {   // ✅ now actually overrides
        System.out.println("Opening: " + url);
    }

    @Override
    public void quit() {
        System.out.println("Closing: " + browserName);
    }

    public abstract void openBrowser();
}

class ChromeDriver extends RemoteWebDriver {

    public ChromeDriver() {
        super("Chrome");               // ✅ hardcode browser name here
    }

    @Override
    public void openBrowser() {
        System.out.println("Chrome launched successfully");
    }
}

public class WebDriverTest {
    public static void main(String[] args) {
        Webdriver driver = new ChromeDriver();   // ✅ interface reference
        driver.openBrowser();
        driver.navigateTo("https://google.com");
        driver.quit();
    }
}