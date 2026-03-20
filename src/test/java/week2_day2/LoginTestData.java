package week2_day2;

import java.util.HashMap;
import java.util.Map;

public class LoginTestData {
    public static void main(String[] args) {

        // key = scenario name, value = expected result
        HashMap<String, String> loginScenarios = new HashMap<>();
        loginScenarios.put("valid_email_valid_password",    "Login Successful");
        loginScenarios.put("invalid_email_valid_password",  "Your email or password is incorrect!");
        loginScenarios.put("valid_email_wrong_password",    "Your email or password is incorrect!");
        loginScenarios.put("empty_email_valid_password",    "Email cannot be empty");
        loginScenarios.put("valid_email_empty_password",    "Password cannot be empty");

        // simulate running each scenario
        System.out.println("===== LOGIN TEST SCENARIOS =====\n");
        int testNum = 1;
        for (Map.Entry<String, String> scenario : loginScenarios.entrySet()) {
            System.out.println("Test " + testNum + ": " + scenario.getKey());
            System.out.println("  Expected: " + scenario.getValue());
            System.out.println("  Status:   PASS ✅");
            System.out.println();
            testNum++;
        }

        System.out.println("Total scenarios executed: " + loginScenarios.size());

        // getOrDefault — safe way to access
        String result = loginScenarios.getOrDefault( "valid_email_wrong_passworddasdfsadsadsada",  "Scenario not found" );
        System.out.println("Unknown scenario result: " + result);
    }
}