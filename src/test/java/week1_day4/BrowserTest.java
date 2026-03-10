package week1_day4;

class Webdriver {
	String browsername;

	Webdriver(String browsername) {
		this.browsername = browsername;
	}

	void openBrowser() {
		System.out.println("Opening Browser: " + browsername);
	}

	void navigateTo(String url) {
		System.out.println("Opening URL:" + url);
	}

	void closeBrowser() {
		System.out.println("Closing Browser: " + browsername);
	}
}

	class Chromedriver extends Webdriver {
		Chromedriver(String browsername) {
			super(browsername);
		}

		@Override
		void openBrowser() {
			System.out.println("Opening new Browser: " + browsername);
		}

		@Override
		void navigateTo(String url) {
			System.out.println("Navigating to URL: " + url);
		}

		@Override
		void closeBrowser() {
			System.out.println("Closing the Browser: " + browsername);
		}
	}

	public  class BrowserTest {

		public static void main(String[] args) {
			Webdriver cd = new Chromedriver("Chrome");
			cd.openBrowser();
			cd.navigateTo("www.google.com");
			cd.closeBrowser();
		}

	}

