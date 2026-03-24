package week2_day4;

public class BasicExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Division:");

		try {
			int a = 10, b = 0;
			int c = a / b;
			System.out.println("Division is stopped" + c);

		} catch (ArithmeticException e) {
			System.out.println("Caught error: " + e.getMessage());
		} finally {
			System.out.println("Division is completed");
		}

		System.out.println("\nNull Pointer:");

		try {
			String text = null;
			System.out.println(text.length());

		} catch (NullPointerException e) {
			System.out.println("Caught error: " + e.getMessage());
		} finally {
			System.out.println("Text cannot be empty/Null");
		}
		System.out.println("\nArray out of bounds");

		try {
			String[] apple = { "ios14", "ios15", "ios16" };
			System.out.println(apple[5]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught error: " + e.getMessage());
		} finally {
			System.out.println("Cannot invoke arrays which are not present");
		}

		System.out.println("\nNumber format");
		try {
			String price = "Rs.499"; // cannot parse directly
			int num = Integer.parseInt(price);
			System.out.println("Parsed: " + num);
		} catch (NumberFormatException e) {
			System.out.println("Caught: Invalid number format — " + e.getMessage());
		} finally {
			System.out.println("Finally block ran");
		}

		System.out.println("\nAll tests completed — program continues!");

	}

}
