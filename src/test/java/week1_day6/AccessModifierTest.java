package week1_day6;

class Company {
    public String companyName = "WNS";          // public — everyone can see
    protected String department = "QA";          // protected — child classes
    String location = "Chennai";                    // default — same package
    private String secretKey = "U479101";       // private — only this class

    public void displayPublicInfo() {
        System.out.println("Company: " + companyName);
        System.out.println("Department: " + department);
        System.out.println("Location: " + location);
        System.out.println("Secret: " + secretKey);  // ✅ own class can access
    }
}

class TechTeam extends Company {
    public void displayTeamInfo() {
        System.out.println("Company: " + companyName);   // ✅ public
        System.out.println("Dept: " + department);        // ✅ protected
        System.out.println("Location: " + location);      // ✅ default — same package
       // System.out.println(secretKey);               // ❌ private — error
    }
}

public class AccessModifierTest {
    public static void main(String[] args) {
        Company c = new Company();
        c.displayPublicInfo();

        System.out.println("---");

        TechTeam t = new TechTeam();
        t.displayTeamInfo();
    }
}