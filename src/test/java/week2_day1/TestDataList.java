package week2_day1;

import java.util.ArrayList;

public class TestDataList {
    public static void main(String[] args) {

        // simulate data driven testing
        ArrayList<String> usernames = new ArrayList<>();
        ArrayList<String> passwords = new ArrayList<>();
        ArrayList<String> expectedResults = new ArrayList<>();

        // test data
        usernames.add("vjyrajan1305@gmail.com");
        usernames.add("wrongemail.com");         // invalid
        usernames.add("");                        // empty
        usernames.add("admin@automationexercise.com");

        passwords.add("Pass@1234");
        passwords.add("Pass@1234");
        passwords.add("Pass@1234");
        passwords.add("Admin@123");

        expectedResults.add("Login Successful");
        expectedResults.add("Invalid email format");
        expectedResults.add("Email cannot be empty");
        expectedResults.add("Login Successful");

        System.out.println("===== DATA DRIVEN LOGIN TESTS =====");

        for (int i = 0; i < usernames.size(); i++) {
            System.out.println("\nTest " + (i + 1) + ":");
            System.out.println("  Username: " + usernames.get(i));
            System.out.println("  Password: " + passwords.get(i));
            System.out.println("  Expected: " + expectedResults.get(i));
        }

        System.out.println("\nTotal test scenarios: " + usernames.size());
    }
}