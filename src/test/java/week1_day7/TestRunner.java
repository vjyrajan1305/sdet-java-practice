package week1_day7;

public class TestRunner {
public static void main(String[] args) {
	System.out.println("Automationexercise.com — Test Suite");
	
	String browser="Chrome";
	
	User newUser = new User("Vijay", "Vijay@gmail.com", "Pass1234", "Vijay", "Rajan", "7871200832");
	LoginPage lp= new LoginPage("Chrome");
	lp.loginUser(newUser);
	lp.getPageName();
	lp.verifyPageLoaded();
	lp.loginWithInvalidCredentials("vijay222", "oas");
	lp.logoutUser(newUser);
	 System.out.println("   All Test Cases Completed!");
	 
	 BasePage bp = new LoginPage(browser); 
		System.out.println(bp.getPageName());
	
	}
}

