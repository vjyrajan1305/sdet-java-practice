package week2_day4;

public class ThrowAndThrows {
	static void validateEmail(String email) throws IllegalArgumentException {
		if (email == null || email.isBlank()) {
			throw new IllegalArgumentException("Email cannot be null or empty");
		}
		if (!email.contains("@")) {
            throw new IllegalArgumentException("Invalid email format: " + email);
        }
		System.out.println("Email is valid: " + email);
	}

	public static void main(String[] args) {

		String[] email = { "vijay@wns.com", "", null,"vijaywns.com" };
		
		for (String i : email) {
			try {
				validateEmail(i);
			} catch (Exception e) {
				System.out.println("Email not valid: "+e.getMessage());
			}
		}

	}

}
