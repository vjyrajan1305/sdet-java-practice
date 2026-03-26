package week2_day6;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "selenium";

		String reversed = "";
		// Loop method
		for (int i = (original.length() - 1); i >= 0; i--) {
			reversed += original.charAt(i);
		}
		System.out.println(reversed);
		
		// String Builder Method
		String rev = new StringBuilder(original).reverse().toString();
		System.out.println("\nReversed : " + rev);
	}

}
