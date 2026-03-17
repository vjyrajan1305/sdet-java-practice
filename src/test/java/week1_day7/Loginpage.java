package week1_day7;

class LoginPage extends BasePage {

    LoginPage(String browserName) {
        super(browserName);
    }

    // TC1 — Login with valid credentials
    public void loginUser(User user) {
        System.out.println("\n>> TC1: Login User with correct email and password");
        navigateTo(BASE_URL + "/login");
        verifyPageLoaded();
        typeText("Email", user.getEmail());
        typeText("Password", user.getPassword());
        clickElement("Login Button");
        user.setLoggedIn(true);                          // User already validated — trust it
        verifyText("Logged in as " + user.getName());
        System.out.println("Result: PASS ✅");
    }

    // TC2 — Login with invalid credentials
    public void loginWithInvalidCredentials(String email, String password) {
        System.out.println("\n>> TC2: Login with incorrect email and password");
        navigateTo(BASE_URL + "/login");
        verifyPageLoaded();
        typeText("Email", email);
        typeText("Password", password);
        clickElement("Login Button");
        verifyText("Your email or password is incorrect!");
        System.out.println("Result: PASS ✅");
    }

    // TC3 — Logout
    public void logoutUser(User user) {
        System.out.println("\n>> TC3: Logout User");
        clickElement("Logout Button");
        user.setLoggedIn(false);                        // update User state
        verifyText("Login to your account");
        System.out.println("Result: PASS ✅");
    }

    @Override
    public String getPageName() {
        return "Login Page";
    }

    @Override
    public void verifyPageLoaded() {
        verifyText("Login to your account");
        verifyText("New User Signup!");
    }
}