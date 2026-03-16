package week1_day7;

public class User {
	private String name;
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private boolean loggedIn;

	User(String name, String email, String password, String firstName, String lastName, String mobileNumber) {
		setName(name);
	    setEmail(email);
	    setPassword(password);
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.mobileNumber = mobileNumber;
	    this.loggedIn = false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.isEmpty()) {
			System.out.println("Name cannot be null or empty");
		} else {
			this.name = name;
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email == null || !email.contains("@")) {
			System.out.println("Email cannot be null or empty");
		} else {
			this.email = email;
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (password == null || password.length() < 6) {
			System.out.println("Email cannot be null or empty");
		} else {
			this.password = password;
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	public void displayInfo() {
		System.out.println("User:" + name + " ,Email" + email + " ,loggedIn:" + loggedIn);

	}
}
