package week2_day4;

public class MultipleCatchDemo {

	static void multiplecatch(int scenario) {

		try {
			if (scenario == 1) {
				String ele = null;
				ele.length();
			} else if (scenario == 2) {
				int a = 10, b = 0;
				int c = a / b;
				System.out.println("Division:" + c);
			} else if (scenario == 3) {
				int arr[] = { 1, 2, 3 };
				System.out.println("value:" + arr[6]);
			} else if (scenario == 4) {
				String timeOut = "tenseconds";
				int t = Integer.parseInt(timeOut);
				System.out.println(t);
			}
		} catch (NullPointerException e) {
			System.out.println("Result : " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("Cannot " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Result : " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Result :" + e.getMessage());
		}
	}

	public static void main(String[] args) {
		int scenario[] = { 1, 2, 3, 4 };
		for (int i : scenario) {
			System.out.println("Scenario: " + i);
			multiplecatch(i);
		}
	}

}
